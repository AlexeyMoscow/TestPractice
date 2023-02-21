import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.MainPage;

public class TestCase_3 extends BaseTest{

    private final static String BASE_URL = "https://store.steampowered.com/";

    @Test
    public void TestCase3(){
        //Step 1
        MainPage mainPage = new MainPage(BASE_URL);
        Assert.assertTrue(mainPage.isMainPageOpen(),"Main page is NOT opened");

        //Step 2

    }
}
