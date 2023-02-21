import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.AdvancedSearchPage;
import pageModels.MainPage;
import pageModels.MarketPage;

public class TestCase_3 extends BaseTest{

    private final static String BASE_URL = "https://store.steampowered.com/";

    @Test
    public void TestCase3() {
        //Step 1
        MainPage mainPage = new MainPage(BASE_URL);
        Assert.assertTrue(mainPage.isMainPageOpen(), "Main page is NOT opened");

        //Step 2
        mainPage.openMarketPage();
        MarketPage marketPage = new MarketPage();
        Assert.assertTrue(marketPage.isMarketPageOpen(), "Market Page is NOT opened");

        //Step 3
        marketPage.openAdvancedSearch();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        Assert.assertTrue(advancedSearchPage.isAdvancedSearchFromOpened(),"Advanced search from is NOT opened");

       //Step 4
        advancedSearchPage.selectSearchParams();

    }
}
