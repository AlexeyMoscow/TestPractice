package pageModels;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdvancedSearchPage {
    private final SelenideElement advancedSearchForm = $(By.xpath("//div[@id='market_advancedsearch_dialog']"));
    private final SelenideElement gamesDropDownList = $(By.xpath("//div[@class='popup_item market_advancedsearch_appname']"));
    private final SelenideElement gameChoiceCheckBox = $(By.xpath("//div[@id='app_option_570']"));
    private final SelenideElement heroChoiceDropDawnList = $(By.xpath("//select[@name='category_570_Hero[]']"));
    private final SelenideElement heroChoice = $(By.xpath("//option[@value='tag_npc_dota_hero_life_stealer']"));
    private final SelenideElement rarityCheckBox = $(By.xpath("//input[@id='tag_570_Rarity_Rarity_Immortal']"));
    private final SelenideElement searchInputField = $(By.xpath("//input[@id='advancedSearchBox']"));
    private final SelenideElement searchButton = $(By.xpath("//div[@class='market_advancedsearch_bottombuttons']//span"));

    public boolean isAdvancedSearchFromOpened(){
       return advancedSearchForm.exists();
    }

    public void selectSearchParams(){
        gamesDropDownList.click();
        gameChoiceCheckBox.click();
        heroChoiceDropDawnList.click();
        heroChoice.click();
        rarityCheckBox.click();
        searchInputField.setValue("golden");
        searchButton.click();
    }
}
