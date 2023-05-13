package pageModels;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final static SelenideElement textAreaConfirmation = $(By.xpath("//div[@class='tox-edit-area']"));
    private final static SelenideElement iFrame = $(By.xpath("//iframe[@id='mce_0_ifr']"));
    private final static SelenideElement textAreaInFrame = $(By.xpath("//body[@id='tinymce']"));
    private final static SelenideElement makeStrongTextButton = $(By.xpath("//button[@class='tox-tbtn' and @title='Bold']"));
    private final static SelenideElement textInBoldStyle = $(By.xpath("//body[@id='tinymce']//strong"));
    private final static SelenideElement filledTextAreaInFrame = $(By.xpath("//body[@id='tinymce']/p"));

    public void openMainPage(String url) {
        Selenide.open(url);
    }

    public boolean isMainPageOpened() {
        return textAreaConfirmation.exists();
    }

    public boolean isTextFormatInBoldStyle() {
        Selenide.switchTo().frame(iFrame);
        return textInBoldStyle.exists();
    }

    public void fillInTextArea(String randomString) {
        Selenide.switchTo().frame(iFrame);
        textAreaInFrame.clear();
        textAreaInFrame.sendKeys(randomString);
    }

    public void makeTextStrong() {
        textAreaInFrame.doubleClick();
        Selenide.switchTo().defaultContent();
        makeStrongTextButton.click();
    }

    public String getTextFromTextField() {
        return filledTextAreaInFrame.getOwnText();
    }

}
