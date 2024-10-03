package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.TermsAndConditionPage;

public class TermsAndConditionSteps {

    WebDriver driver;
    HomePage hp;
    TermsAndConditionPage tp;

    public TermsAndConditionSteps()
    {
        this.driver = BaseClass.getDriver(); // Ensure this method retrieves a valid driver instance
        this.hp = new HomePage(driver);
        this.tp = new TermsAndConditionPage(driver);
    }

    @When("I click on the Terms and Conditions link in the footer")
    public void i_click_on_the_terms_and_conditions_link_in_the_footer() {

        BaseClass.getLogger().info("Navigating to homepage");
        hp.acceptCookies();  // Accept cookies if necessary
        hp.clickOnTermsCondtionsLnk();

    }
    @Then("I should be redirected to the Terms and Conditions page")
    public void i_should_be_redirected_to_the_terms_and_conditions_page() {
        boolean actualtxt=tp.verifyTermsAndConditionTxt();
        Assert.assertEquals(actualtxt,true);
    }
    @Then("the page title should be Terms and Conditions")
    public void the_page_title_should_be_terms_and_conditions() {
        String actualTitle="Terms and Conditions | Lyca Mobile UK";
        String expectedTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    @Then("the URL should be https:\\/\\/www.lycamobile.co.uk\\/en\\/termscondition\\/")
    public void the_url_should_be_https_www_lycamobile_co_uk_en_termscondition() {
        String actualUrl="https://www.lycamobile.co.uk/en/termscondition/";
        String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }


}
