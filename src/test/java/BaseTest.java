import org.testng.annotations.Test;
import utils.PropertiesProvider;

public class BaseTest {

    @Test
    public void testCase1(){
        System.out.println(PropertiesProvider.getFromProperties("baseUrl"));
    }
}
