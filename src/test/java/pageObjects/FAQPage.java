package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQPage extends BasePage{

    public FAQPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item pageTitle_pageTitle__KIWHv css-1ul47bz']//strong[contains(text(),'Frequently Asked Questions')]")
    WebElement frequentlyAskedQuestionsTxt;

    public boolean frequentlyAskedQuestionsExist()
    {
        return frequentlyAskedQuestionsTxt.isDisplayed();
    }

}
