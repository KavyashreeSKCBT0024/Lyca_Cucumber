package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.FAQPage;
import pageObjects.HomePage;

public class FQASteps {

    WebDriver driver;
    HomePage hp;
    FAQPage faq;

    @Given("I am on the homepage")
    public void homepage() {
        BaseClass.getLogger().info("Navigate to homepage");
        hp=new HomePage(BaseClass.getDriver());
        hp.acceptCookies();
    }
    @Given("I click on the FAQ link in the footer")
    public void i_click_on_the_faq_link_in_the_footer() {
        hp.clickOnFAQ();
    }
    @Then("I should be taken to the FAQ page")
    public void i_should_be_taken_to_the_faq_page() {
        faq=new FAQPage(BaseClass.getDriver());
        boolean faqTxt=faq.frequentlyAskedQuestionsExist();
        Assert.assertEquals(faqTxt,true);

    }


}
