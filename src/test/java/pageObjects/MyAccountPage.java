package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//p[@id='dashboard-text']")
    WebElement dashboardTxt;

    @FindBy(xpath = "//p[@id='user-logout-text']")
    WebElement logouttxt;

    public boolean verifyDashboardTxt()
    {
        return dashboardTxt.isDisplayed();
    }

    public boolean verifyLogoutBtn()
    {
        return logouttxt.isDisplayed();
    }

}
