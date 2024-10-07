package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AppStorePage;
import pageObjects.GooglePayPage;
import pageObjects.HomePage;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AppDownloadSteps {

    WebDriver driver;
    AppStorePage ap;
    GooglePayPage gp;
    HomePage hp;

    public AppDownloadSteps()
    {
        this.driver= BaseClass.getDriver();
        this.hp = new HomePage(driver);
        this.ap=new AppStorePage(driver);
        this.gp=new GooglePayPage(driver);
    }

    @Given("the customer is on the homepage")
    public void the_customer_is_on_the_homepage() {
        BaseClass.getLogger().info("Navigating to homepage");
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(hp.acceptCookies()));
        hp.acceptCookies();
    }

    @When("the customer clicks on the Download for iOS button")
    public void the_customer_clicks_on_the_download_for_i_os_button() {
        hp.clickOnAppStore();
    }
    @Then("the customer should be redirected to the Apple App Store link")
    public void the_customer_should_be_redirected_to_the_apple_app_store_link() {
        String mainWindowHandle = driver.getWindowHandle();

        // Wait for the new window to open
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
       // boolean verifyappStoreTxt=ap.verifyappStoretxt();
        //Assert.assertEquals(verifyappStoreTxt,true);
        boolean sym=ap.SymbolExist();
        Assert.assertEquals(sym,true);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
       // driver.close();
    }
    @When("the customer clicks on the Download for Android button")
    public void the_customer_clicks_on_the_download_for_android_button() {
        hp.clickOnGooglePlay();
    }
    @Then("the customer should be redirected to the Google Play Store link")
    public void the_customer_should_be_redirected_to_the_google_play_store_link() {
        String mainWindowHandle = driver.getWindowHandle();

        // Wait for the new window to open
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        boolean verifytxt=gp.verifyText();
        Assert.assertEquals(verifytxt,true);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

}
