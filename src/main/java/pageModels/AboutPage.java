package pageModels;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.Utils;

public class AboutPage extends Form {
    private static final By aboutPageUniqueElement = By.xpath("//div[@id='about_header_area']");
    private final By gamersOnlineLocator = By.xpath("//div[@class='online_stat_label gamers_online']/ancestor::div[@class='online_stat']");
    private final By gamersInGameLocator = By.xpath("//div[@class='online_stat_label gamers_in_game']/ancestor::div[@class='online_stat']");

    private ILabel gamersOnline = getElementFactory().getLabel(gamersOnlineLocator,"Gamers Online");
    private ILabel gamersInGame = getElementFactory().getLabel(gamersInGameLocator, "Gamer in game");

    public AboutPage(){
        super(aboutPageUniqueElement,"About page");
    }

    public boolean isAboutPage(){
        return this.state().isDisplayed();
    }

    public boolean compareQuantityOfGamers(){
           return Integer.parseInt(Utils.extractDigits(gamersOnline.getText())) > Integer.parseInt(Utils.extractDigits(gamersInGame.getText()));
    }
}
