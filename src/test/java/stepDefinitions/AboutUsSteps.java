package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.AboutUsPage;
import pageObjects.HomePage;


public class AboutUsSteps {

    WebDriver driver;
    HomePage hp;
    AboutUsPage ap;

    @Given("user on the homepage")
    public void user_on_the_homepage() {

        BaseClass.getLogger().info("Navigate to homepage");
        hp=new HomePage(BaseClass.getDriver());
        hp.acceptCookies();

    }
    @Given("I click on the About Us link in the footer")
    public void i_click_on_the_about_us_link_in_the_footer() {

        hp.clickOnAboutUs();
    }
    @Then("I should be redirected to the About Us page")
    public void i_should_be_redirected_to_the_about_us_page() {
        ap=new AboutUsPage(BaseClass.getDriver());
       boolean textpresent= ap.aboutUsTxtExist();
        Assert.assertEquals(textpresent,true);
    }
    @Then("I should see information about the company")
    public void i_should_see_information_about_the_company() {

    }

}
