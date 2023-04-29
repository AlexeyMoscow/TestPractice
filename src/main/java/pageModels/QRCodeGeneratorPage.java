package pageModels;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;

public class QRCodeGeneratorPage {

    private static final SelenideElement generateQRButton = $(By.xpath("//div[@class='formBottom']//input[@type='submit']"));
    private static final SelenideElement typeUrl = $(By.xpath("//div[@class='type']//a"));
    private static final SelenideElement inputForUrl = $(By.xpath("//div[@class='inputCover']//input"));
    private static final SelenideElement generatedQR = $(By.xpath("//div[@class='image']//img"));

    public void openMainPage(String url) {
        Selenide.open(url);
    }

    public void fillTextField(String generatedText) {
        typeUrl.click();
        inputForUrl.clear();
        inputForUrl.sendKeys(generatedText);
        generateQRButton.click();
    }

    public File getGeneratedQR() {
        File outPutFile;
        try {
            BufferedImage bufferedImage = ImageIO.read(new URL(generatedQR.getAttribute("src")));
            outPutFile = new File("generated_QR.png");
            ImageIO.write(bufferedImage, "png", outPutFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return outPutFile;
    }
}
