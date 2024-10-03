package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.CoverageAndServicePage;
import pageObjects.HomePage;
import pageObjects.PrivacyPolicyPage;

public class PrivacyPolicySteps {

    WebDriver driver;
    HomePage hp;
    PrivacyPolicyPage pp;

    public PrivacyPolicySteps()
    {
        this.driver = BaseClass.getDriver(); // Ensure this method retrieves a valid driver instance
        this.hp = new HomePage(driver);
        this.pp = new PrivacyPolicyPage(driver);
    }

    @When("I click on the Privacy Policy link in the footer")
    public void i_click_on_the_privacy_policy_link_in_the_footer()  {
        BaseClass.getLogger().info("Navigating to homepage");
        hp.acceptCookies();  // Accept cookies if necessary
        hp.clickOnPrivacyPolicy();
    }
    @Then("I should be redirected to the Privacy Policy page")
    public void i_should_be_redirected_to_the_privacy_policy_page() {
         String expectedUrl="https://www.lycamobile.co.uk/en/";
         String actualUrl=driver.getCurrentUrl();
         Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Then("the page title should be Best Pay Monthly & Pay as You Go SIM Only Deals | Lyca Mobile")
    public void the_page_title_should_be_lyca_mobile_privacy_policy_protecting_your_personal_data() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Best Pay Monthly & Pay as You Go SIM Only Deals | Lyca Mobile";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("it should display privacy policy text")
    public void verifyTextmessage() {
        boolean actualtxt=pp.verifyprivacyPolicyTxt();
        Assert.assertEquals(actualtxt, true);
    }



}
