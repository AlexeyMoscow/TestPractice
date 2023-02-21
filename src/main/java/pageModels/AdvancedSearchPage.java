package pageModels;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdvancedSearchPage {
    private final SelenideElement advancedSearchForm = $(By.xpath("//div[@id='market_advancedsearch_dialog']"));
    private final SelenideElement gamesDropDownList = $(By.xpath("//div[@class='popup_item market_advancedsearch_appname']"));

    public boolean isAdvancedSearchFromOpened(){
       return advancedSearchForm.exists();
    }

    public void selectSearchParams(){
        gamesDropDownList.click();
    }
}
