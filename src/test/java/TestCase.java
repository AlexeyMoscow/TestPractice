import org.testng.Assert;
import org.testng.annotations.Test;
import pageModels.QRCodeGeneratorPage;
import utils.PropertiesProvider;
import utils.QRDecoder;


public class TestCase extends BaseTest {

    @Test
    public void testCase1() {
        QRCodeGeneratorPage qrCodeGeneratorPage = new QRCodeGeneratorPage();
        String textToBeConvertedToQR = PropertiesProvider.getFromProperties("textToBeConvertedToQR");

        //Step 1
        qrCodeGeneratorPage.openMainPage(PropertiesProvider.getFromProperties("baseUrl"));
        Assert.assertTrue(qrCodeGeneratorPage.isQRCodePageOpened(), "QR code generation page is NOT opened");

        //Step 2
        qrCodeGeneratorPage.chooseTypeOfText();
        Assert.assertEquals(qrCodeGeneratorPage.isTitleChanged(), "введите url:", "Title has not correct text");

        //Step 3
        qrCodeGeneratorPage.fillTextField(textToBeConvertedToQR);
        Assert.assertTrue(qrCodeGeneratorPage.isQRCodeGenerated(), "QR code is NOT generated");

        //Step 4
        Assert.assertEquals(QRDecoder.QRReader(qrCodeGeneratorPage.getGeneratedQR()), textToBeConvertedToQR, "Initial text and text from QR NOT the same");

    }
}
