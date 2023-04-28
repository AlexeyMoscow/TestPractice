import org.testng.annotations.Test;
import pageModels.QRCodeGeneratorPage;
import utils.PropertiesProvider;

public class TestCase extends BaseTest {

    @Test
    public void testCase1(){
        QRCodeGeneratorPage qrCodeGeneratorPage = new QRCodeGeneratorPage();

        //Step 1
        qrCodeGeneratorPage.openMainPage(PropertiesProvider.getFromProperties("baseUrl"));
        qrCodeGeneratorPage.fillTextField("SomeText");
        int a=0;
    }
}
