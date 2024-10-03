package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CodeOfPractiesPage extends BasePage{

    public CodeOfPractiesPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item pageTitle_pageTitle__KIWHv css-1ul47bz']//h1[@id='Codeofpractice']")
    WebElement customerCodeofPracticeTxt;

    public boolean codeofPracticeExist()
    {
        return customerCodeofPracticeTxt.isDisplayed();
    }
}
