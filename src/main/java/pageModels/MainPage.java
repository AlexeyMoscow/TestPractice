package pageModels;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement mainPageMenu = $(By.xpath("//div[@class='home_page_gutter_block']"));

    public MainPage(String url){
        Selenide.open(url);
    }

    public boolean isMainPageOpen(){
        return mainPageMenu.exists();
    }

}
