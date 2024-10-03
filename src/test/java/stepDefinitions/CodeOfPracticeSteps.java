package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.CodeOfPractiesPage;
import pageObjects.HomePage;

public class CodeOfPracticeSteps {

    WebDriver driver;
    HomePage hp;
    CodeOfPractiesPage cp;

    @When("I click on the Code of Practice link in the navigation menu")
    public void i_click_on_the_code_of_practice_link_in_the_navigation_menu() {

        BaseClass.getLogger().info("Navigate to homepage");
        hp=new HomePage(BaseClass.getDriver());
        hp.acceptCookies();
        hp.clickOnCodeOfPractice();
    }
    @Then("I should be redirected to the Code of Practice page")
    public void i_should_be_redirected_to_the_code_of_practice_page() {
        cp=new CodeOfPractiesPage(BaseClass.getDriver());
        boolean actTxt=cp.codeofPracticeExist();
        Assert.assertEquals(actTxt,true);
    }
    @Then("I should see the content related to the Code of Practice")
    public void i_should_see_the_content_related_to_the_code_of_practice() {

    }

}
