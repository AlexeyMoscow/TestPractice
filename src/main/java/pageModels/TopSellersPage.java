package pageModels;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class TopSellersPage extends Form {
    private static final By topSellersUnique = By.xpath("//table[@class='weeklytopsellers_ChartTable_3arZn']");

    public TopSellersPage(){
        super(topSellersUnique,"Top sellers page");
    }

    public boolean isTopSellersPageOpened(){
        this.state().waitForDisplayed();
        return this.state().isDisplayed();
    }
}
