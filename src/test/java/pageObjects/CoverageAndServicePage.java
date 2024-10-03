package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageAndServicePage extends BasePage{

    public CoverageAndServicePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item pageTitle_pageTitle__KIWHv css-1ul47bz']//h1[@id='Coverage']")
    WebElement checkLycaCoverageMapTxt;

    public boolean verifyTxt()
    {

        return checkLycaCoverageMapTxt.isDisplayed();
    }
}
