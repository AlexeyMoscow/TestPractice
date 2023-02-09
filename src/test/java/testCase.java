import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.MainPage;

import java.util.Properties;

public class testCase extends BaseTest {
    Properties properties = utils.FileUtils.loadProperties("src/main/resources/testConfig.properties");
    String baseUrl = properties.getProperty("baseUrl");

    MainPage mainPage = new MainPage();

    @Test
    public void firstCase() {
        browser.goTo(baseUrl);
        Assert.assertTrue(mainPage.isMainPageOpened(), "Main page is not loaded");
        mainPage.openAboutPage();
    }
}
