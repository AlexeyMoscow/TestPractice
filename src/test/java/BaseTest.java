import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

abstract public class BaseTest {
    public void setUp() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
    }

    @BeforeSuite
    public void init() {
        setUp();
    }

    @AfterSuite
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
