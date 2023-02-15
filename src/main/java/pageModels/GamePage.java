package pageModels;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import models.Game;
import org.openqa.selenium.By;

public class GamePage extends Form {

    private final static By uniqueElement = By.xpath("//div[@class='game_description_snippet']");
    private final By gameNameLocator = By.xpath("//div[@id='appHubAppName']");
    private final By gamePriceLocator = By.xpath("//div[@class='game_purchase_price price']");

    private final ILabel gameName = getElementFactory().getLabel(gameNameLocator, "Game name from game page");
    private final ILabel gamePrice = getElementFactory().getLabel(gamePriceLocator, "Game price from game page");

    public GamePage(){
        super(uniqueElement,"Game page");
    }

    public Game getGameInfoFromGamePage(){
        return new Game(gameName.getText(), gamePrice.getText());
    }


}
