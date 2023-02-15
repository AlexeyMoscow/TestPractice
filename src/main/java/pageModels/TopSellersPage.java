package pageModels;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import models.Game;
import org.openqa.selenium.By;

public class TopSellersPage extends Form {
    private static final By topSellersUnique = By.xpath("//table[@class='weeklytopsellers_ChartTable_3arZn']");
    private final By firstGameName = By.xpath("//div[@class='weeklytopsellers_GameName_1n_4-'][1]");
    private final By firstGamePrice = By.xpath("//div[@class='salepreviewwidgets_StoreSalePriceBox_Wh0L8'][1]");

    private ILabel gameName = getElementFactory().getLabel(firstGameName,"Game name");
    private ILabel gamePrice = getElementFactory().getLabel(firstGamePrice, "Game price");


    public TopSellersPage(){
        super(topSellersUnique,"Top sellers page");
    }

    public boolean isTopSellersPageOpened(){
        this.state().waitForDisplayed();
        return this.state().isDisplayed();
    }

    public void openTopGameInList(){
        gameName.click();
    }

    public Game getGameInfo(){
        return new Game(gameName.getText(),gamePrice.getText());
    }

}
