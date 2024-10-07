package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppStorePage extends BasePage{

    public AppStorePage(WebDriver driver)
    {
        super(driver);
    }

   // @FindBy(xpath = "//span[@class='we-localnav__title__product']")
   // WebElement appStoreExist;
    @FindBy(xpath = "//span[text()='Apple']")
    WebElement appleSynmol;

    public boolean verifyappStoretxt()
    {
        return appleSynmol.isDisplayed();
    }

    public boolean SymbolExist()
    {
        return appleSynmol.isDisplayed();
    }
}
