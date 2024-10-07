package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheapInternationalCallsPage extends BasePage{

    public CheapInternationalCallsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//h1[@id='Internationalcalls']")
    WebElement internationCallsTxt;

    @FindBy(xpath = "//div[@class='PlanCard_container__GLQho']")
    List<WebElement> planDetails;

    public boolean internationalTxtExist()
    {
        return internationCallsTxt.isDisplayed();
    }

}
