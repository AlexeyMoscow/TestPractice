import org.testng.annotations.Test;
import pageModels.QRCodeGeneratorPage;
import utils.PropertiesProvider;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCase extends BaseTest {

    @Test
    public void testCase1() throws IOException {
        QRCodeGeneratorPage qrCodeGeneratorPage = new QRCodeGeneratorPage();

        //Step 1
        qrCodeGeneratorPage.openMainPage(PropertiesProvider.getFromProperties("baseUrl"));
        qrCodeGeneratorPage.fillTextField(PropertiesProvider.getFromProperties("textToBeConvertedToQR"));
        qrCodeGeneratorPage.getGeneratedQR();
        int a=0;
    }
}
