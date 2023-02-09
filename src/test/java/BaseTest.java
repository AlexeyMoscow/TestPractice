import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected Browser browser;

    @BeforeTest
    public void setUp(){
        browser = AqualityServices.getBrowser();
        browser.maximize();
    }
    @AfterTest
    public void tearDown(){
        browser.quit();
    }
}
