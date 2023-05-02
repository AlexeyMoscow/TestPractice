import org.testng.annotations.Test;
import utils.PropertiesProvider;

public class TestCase extends BaseTest{

    @Test
    public void testCase_1(){
        System.out.println(PropertiesProvider.getFromProperties("url"));
    }

}
