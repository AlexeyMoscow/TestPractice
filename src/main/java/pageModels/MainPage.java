package pageModels;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.PropertiesProvider;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final static SelenideElement textAreaConfirmation = $(By.xpath("//div[@class='tox-edit-area']"));
    private final static SelenideElement iFrame = $(By.xpath("//iframe[@id='mce_0_ifr']"));
    private final static SelenideElement textAreaInFrame = $(By.xpath("//body[@id='tinymce']"));

    public void openMainPage(String url){
        Selenide.open(url);
    }

    public boolean isMainPageOpened(){
        return textAreaConfirmation.exists();
    }

    public void fillInTextArea(){
        Selenide.switchTo().frame(iFrame);
        textAreaInFrame.clear();
        textAreaInFrame.sendKeys("fsdfsdfsdfsdfsdfsd");

    }

}
