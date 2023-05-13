import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.MainPage;
import utils.RandomStringGenerator;

import static utils.PropertiesProvider.getFromProperties;

public class TestCase extends BaseTest{

    @Test
    public void testCase_1(){
        MainPage mainPage = new MainPage();
        int generatedTextLength = Integer.parseInt(getFromProperties("randomTextLength"));
        String randomGeneratedText = RandomStringGenerator.generateRandomText(generatedTextLength);

        //Step 1
        mainPage.openMainPage(getFromProperties("url"));
        Assert.assertTrue(mainPage.isMainPageOpened(), "Main Page is NOT opened");

        //Step 2
        mainPage.fillInTextArea(randomGeneratedText);
        Assert.assertEquals(randomGeneratedText,mainPage.getTextFromTextField(), "Generated text and text from filed is NOT equals");

        //Step 3
        mainPage.makeTextStrong();
        Assert.assertTrue(mainPage.isTextFormatInBoldStyle(), "Text is NOT in bold style");
    }

}
