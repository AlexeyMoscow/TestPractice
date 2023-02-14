package pageModels;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private static final By mainPageUnique = By.xpath("//div[@id='home_maincap_v7']");
    private final By aboutButtonLocator = By.xpath("//a[normalize-space()='ABOUT']");
    private final By newAndNoteworthyLocator = By.xpath("//div[@id='noteworthy_tab']");
    private final By topSellersLocator = By.xpath("//a[@class='popup_menu_item'][normalize-space()='Top Sellers']");
    private final IButton aboutPageButton = getElementFactory().getButton(aboutButtonLocator, "About page button");
    private final IButton newAndNoteworthyButton = getElementFactory().getButton(newAndNoteworthyLocator,"newAndNoteworthyButton");
    private final IButton topSellersButton = getElementFactory().getButton(topSellersLocator,"Top sellers button");


    public MainPage(){
        super(mainPageUnique,"Main page");
    }

    public void openAboutPage(){
        aboutPageButton.click();
    }

    public boolean isMainPageOpened(){
        return this.state().isDisplayed();
    }

    public void openTopSellersPage(){
        newAndNoteworthyButton.getMouseActions().moveMouseToElement();
        topSellersButton.state().waitForClickable();
        topSellersButton.click();
    }


}
