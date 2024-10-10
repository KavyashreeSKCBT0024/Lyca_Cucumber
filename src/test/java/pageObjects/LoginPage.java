package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='wentFromLoginTextField']")
    WebElement enterLycaNum;

    @FindBy(xpath = "//button[@id='login-button']")
    WebElement clickLoginBtn;

    @FindBy(xpath = "//input[@aria-label='Please enter OTP character 1']")
    WebElement enterPassCode;

    @FindBy(xpath = "//button[@id='login-confirm-btn']")
    WebElement confirmPasscode;

    @FindBy(xpath = "//img[@id='validation-error-icon']")
    WebElement errorMsg;

    public void enterValidLycaNum(String phoneNumber)
    {

        enterLycaNum.sendKeys(phoneNumber);
    }
    public void enterInvalidLycaNum()
    {

        enterLycaNum.sendKeys("7417523664");
    }
    public void clickOnLogin()
    {
        clickLoginBtn.click();
    }
    public void enterPassCode()
    {
        enterPassCode.sendKeys("6278");
    }
    public void clickOnConfirmPasscode()
    {
        confirmPasscode.click();
    }

    public boolean invalidCredintialTxt()
    {
        return errorMsg.isDisplayed();
    }

}
