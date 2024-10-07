package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePayPage extends BasePage{

    public GooglePayPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='google_logo Play']")
    WebElement googlePlay_logo;

    public boolean verifyText()
    {
        return googlePlay_logo.isDisplayed();
    }
}
