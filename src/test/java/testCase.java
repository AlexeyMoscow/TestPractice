import org.testng.annotations.Test;

import java.util.Properties;

public class testCase extends BaseTest{
    Properties properties = utils.FileUtils.loadProperties("src/main/resources/testConfig.properties");
    String baseUrl = properties.getProperty("baseUrl");

    @Test
    public void testCase(){
        browser.goTo(baseUrl);
    }
}
