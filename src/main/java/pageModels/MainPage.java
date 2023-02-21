package pageModels;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement mainPageMenu = $(By.xpath("//div[@class='home_page_gutter_block']"));
    private final SelenideElement communityButton = $(By.xpath("//div[@class='content']//a[@class='menuitem supernav'][2]"));
    private final SelenideElement marketButton = $(By.xpath("//div[@class='supernav_content']//div[@class='submenu_community']/a[4]"));


    public MainPage(String url){
        Selenide.open(url);
    }

    public boolean isMainPageOpen(){
        return mainPageMenu.exists();
    }

    public void openMarketPage(){
        communityButton.hover();
        marketButton.click();
    }

}
