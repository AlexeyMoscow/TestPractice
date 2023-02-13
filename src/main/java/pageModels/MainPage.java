package pageModels;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private final By aboutButtonLocator = By.xpath("//a[normalize-space()='ABOUT']");
    private final IButton aboutPageButton = getElementFactory().getButton(aboutButtonLocator, "About page button");
    private static final By mainPageUnique = By.xpath("//div[@id='home_maincap_v7']");

    public MainPage(){
        super(mainPageUnique,"Main page");
    }

    public void openAboutPage(){
        aboutPageButton.click();
    }

    public boolean isMainPageOpened(){
        return this.state().isDisplayed();
    }
}
