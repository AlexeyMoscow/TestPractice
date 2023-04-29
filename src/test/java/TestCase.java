import com.google.zxing.NotFoundException;
import org.testng.annotations.Test;
import pageModels.QRCodeGeneratorPage;
import utils.PropertiesProvider;
import utils.QRDecoder;

import java.io.IOException;

public class TestCase extends BaseTest {

    @Test
    public void testCase1() {
        QRCodeGeneratorPage qrCodeGeneratorPage = new QRCodeGeneratorPage();

        //Step 1
        qrCodeGeneratorPage.openMainPage(PropertiesProvider.getFromProperties("baseUrl"));
        qrCodeGeneratorPage.fillTextField(PropertiesProvider.getFromProperties("textToBeConvertedToQR"));
        System.out.println(QRDecoder.QRReader(qrCodeGeneratorPage.getGeneratedQR()));

    }
}
