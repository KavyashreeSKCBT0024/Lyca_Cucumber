package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    WebElement acceptAllCookies_button;

   @FindBy(xpath = "//img[@id='account-button-image']")
    WebElement profileIcon;

    @FindBy(xpath = "//p[@id='link-name']")
    WebElement myLycaMobilelnk;

    @FindBy(xpath = "//h6[@id='bottom-footer-heading-text-2']")
    WebElement helpSupport;

    @FindBy(xpath = "//a[text()='FAQs']")
    WebElement faqs;

    @FindBy(xpath = "//a[text()='About us']")
    WebElement aboutus;

    @FindBy(xpath = "//a[text()='Code of practice']")
    WebElement codeOfPractice;

    @FindBy(xpath = "//a[@id='coveragecheckerfooter']")
    WebElement coverageCheckLnk;

    @FindBy(xpath = "//a[@id='privacypolicyfooter']")
    WebElement privacyPolicy;

    @FindBy(xpath = "//a[@id='termsconditionsfooter']")
    WebElement terms_conditions;

    public void clickProfileIcon()
    {
        profileIcon.click();
    }

    public void clickOnMyLycaMobileLnk()
    {
        myLycaMobilelnk.click();
    }

    public void acceptCookies()
    {
        acceptAllCookies_button.click();
    }

    public boolean helpAndSupport()
    {
        return helpSupport.isDisplayed();
    }
    public void clickOnFAQ()
    {
        faqs.click();
    }

    public void clickOnAboutUs()
    {
        aboutus.click();
    }

    public void clickOnCodeOfPractice()
    {
        codeOfPractice.click();
    }

    public void clickOnCoverageLnk()
    {
        coverageCheckLnk.click();
    }
    public void clickOnPrivacyPolicy()
    {
        privacyPolicy.click();
    }

    public  void clickOnTermsCondtionsLnk()
    {
        terms_conditions.click();
    }

}