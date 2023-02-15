import models.Game;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.AboutPage;
import pageModels.GamePage;
import pageModels.MainPage;
import pageModels.TopSellersPage;

import java.util.Properties;

public class testCase extends BaseTest {
    Properties properties = utils.FileUtils.loadProperties("src/main/resources/testConfig.properties");
    String baseUrl = properties.getProperty("baseUrl");

    MainPage mainPage = new MainPage();
    AboutPage aboutPage = new AboutPage();
    TopSellersPage topSellersPage = new TopSellersPage();
    GamePage gamePage = new GamePage();

    @Test
    public void firstCase() {
        browser.goTo(baseUrl);
        Assert.assertTrue(mainPage.isMainPageOpened(), "Main page is not loaded");

        mainPage.openAboutPage();
        Assert.assertTrue(aboutPage.isAboutPage(),"About page is NOT opened");
        Assert.assertTrue(aboutPage.compareQuantityOfGamers(),"Numbers of players online is not  more than players in game");
        browser.goBack();
        Assert.assertTrue(mainPage.isMainPageOpened(), "Main page is not loaded");
    }

    @Test
    public void secondCase() {
        //Step 1
        browser.goTo(baseUrl);
        Assert.assertTrue(mainPage.isMainPageOpened(),"Main page is not loaded");
        //Step 2
        mainPage.openTopSellersPage();
        Assert.assertTrue(topSellersPage.isTopSellersPageOpened(),"Top sellers page is NOT opened");
        //Step 3
        Game firstGameInTopList = topSellersPage.getGameInfo();
        topSellersPage.openTopGameInList();
        Game gameFromGamePage = gamePage.getGameInfoFromGamePage();
        Assert.assertEquals(gameFromGamePage, firstGameInTopList);
    }
}
