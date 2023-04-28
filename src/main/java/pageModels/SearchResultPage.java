package pageModels;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    private final SelenideElement gameFilterLabel = $(By.xpath("//div[@class='market_search_results_header']//a"));

    public boolean compareSearchFilters(){
        return gameFilterLabel.getText().equals("Dota 2");
    }
}
