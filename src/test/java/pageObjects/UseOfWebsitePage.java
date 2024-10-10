package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UseOfWebsitePage extends BasePage{

    public UseOfWebsitePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item pageTitle_pageTitle__KIWHv css-1ul47bz']//h2[@id='Useofthiswebsite']")
    WebElement useOfThisWebsiteTxt;

    public boolean textExist()
    {
        return useOfThisWebsiteTxt.isDisplayed();
    }

}
