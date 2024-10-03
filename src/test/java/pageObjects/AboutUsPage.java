package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage{

    public AboutUsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item pageTitle_pageTitle__KIWHv css-1ul47bz']//h1[@id='aboutus']")
    WebElement aboutUsTxt;

    public boolean aboutUsTxtExist()
    {
        return aboutUsTxt.isDisplayed();
    }
}
