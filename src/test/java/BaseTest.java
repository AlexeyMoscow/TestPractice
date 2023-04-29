import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.FileDownloadMode.PROXY;

abstract public class BaseTest {
    public void setUp(){
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        Configuration.proxyEnabled = true;
        Configuration.fileDownload = PROXY;
    }

    @BeforeSuite
    public void init(){
        setUp();
    }

   /* @AfterSuite
    public void tearDown (){
        Selenide.closeWebDriver();
    }*/
}
