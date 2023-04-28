import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

abstract public class BaseTest {

    public void setUp(){
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
       WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;

    }

    @BeforeSuite
    public void init(){
        setUp();
    }

    @AfterSuite
    public void tearDown(){
        Selenide.closeWebDriver();
    }

}
