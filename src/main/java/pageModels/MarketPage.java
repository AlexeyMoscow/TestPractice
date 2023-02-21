package pageModels;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MarketPage {
    private final SelenideElement marketPageMenu = $(By.xpath("//div[@id='sellListings']"));
    private final SelenideElement advancedSearchButton = $(By.xpath("//div[@class='market_search_advanced_button']"));

    public boolean isMarketPageOpen(){
        return marketPageMenu.exists();
    }

    public void openAdvancedSearch(){
        advancedSearchButton.click();
    }


}
