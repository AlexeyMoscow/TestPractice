import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.MainPage;
import utils.PropertiesProvider;

import static utils.PropertiesProvider.getFromProperties;

public class TestCase extends BaseTest{

    @Test
    public void testCase_1(){
        MainPage mainPage = new MainPage();

        //Step 1
        mainPage.openMainPage(getFromProperties("url"));
        Assert.assertTrue(mainPage.isMainPageOpened());

        //Step 2
        mainPage.fillInTextArea();
        int a=0;
    }

}
