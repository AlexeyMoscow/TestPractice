package pageModels;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;

public class QRCodeGeneratorPage {

    private static final SelenideElement generateQRButton = $(By.xpath("//div[@class='formBottom']//input[@type='submit']"));
    private static final SelenideElement typeUrl = $(By.xpath("//div[@class='type']//a"));
    private static final SelenideElement inputForUrl = $(By.xpath("//div[@class='inputCover']//input"));
    private static final SelenideElement generatedQR = $(By.xpath("//div[@class='image']//img"));

    public void openMainPage(String url){
        Selenide.open(url);
    }

    public void fillTextField(String generatedText){
        typeUrl.click();
        inputForUrl.sendKeys(generatedText);
        generateQRButton.click();
    }

    public void getGeneratedQR() throws IOException {
        File downLoadedQR = generatedQR.download();

    }
}
