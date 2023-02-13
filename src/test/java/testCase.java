import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.AboutPage;
import pageModels.MainPage;

import java.util.Properties;

public class testCase extends BaseTest {
    Properties properties = utils.FileUtils.loadProperties("src/main/resources/testConfig.properties");
    String baseUrl = properties.getProperty("baseUrl");

    MainPage mainPage = new MainPage();
    AboutPage aboutPage = new AboutPage();

    @Test
    public void firstCase() throws InterruptedException {
        browser.goTo(baseUrl);
        Assert.assertTrue(mainPage.isMainPageOpened(), "Main page is not loaded");

        mainPage.openAboutPage();
        Assert.assertTrue(aboutPage.isAboutPage(),"About page is NOT opened");
        Assert.assertTrue(aboutPage.compareQuantityOfGamers(),"Numbers of players online is not  more than players in game");

    }
}
