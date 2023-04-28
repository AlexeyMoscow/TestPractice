package pageModels;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class QRCodeGeneratorPage {

    private static final SelenideElement generateQRButton = $(By.xpath("//div[@class='formBottom']//input[@type='submit']"));
    private static final SelenideElement inputField = $(By.xpath("//div[@class='inputCover']//textarea"));

    public void openMainPage(String url){
        Selenide.open(url);
    }

    public void fillTextField(String generatedText){
        inputField.sendKeys(generatedText);
        generateQRButton.click();
    }
}
