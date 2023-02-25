import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.AdvancedSearchPage;
import pageModels.MainPage;
import pageModels.MarketPage;
import utils.Constants;
import utils.PropertiesProvider;

public class TestCase_3 extends BaseTest{

    @Test
    public void TestCase3() {
        //Step 1
        MainPage mainPage = new MainPage(Constants.BASE_URL);
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
