package stepDefinitions;


import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;



public class LoginSteps {

    WebDriver driver;
    HomePage hp;
    LoginPage lp;
    MyAccountPage myacc;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {

        BaseClass.getLogger().info("Navigate to homepage");
        hp=new HomePage(BaseClass.getDriver());
        hp.acceptCookies();

    }
    @When("the user clicks on the profile icon")
    public void the_user_clicks_on_the_profile_icon() {
        hp.clickProfileIcon();
    }

    @When("the user clicks on My LycaMobile")
    public void the_user_clicks_on_my_lyca_mobile()  {
        hp.clickOnMyLycaMobileLnk();

    }
    @When("the user enters a valid phone number")
    public void the_user_enters_a_valid_phone_number() {
        lp=new LoginPage(BaseClass.getDriver());
        lp.enterValidLycaNum();
    }
    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
       lp.clickOnLogin();
    }
    @When("the user enters a valid one-time passcode")
    public void the_user_enters_a_valid_one_time_passcode() {
       lp.enterPassCode();
    }
    @When("the user clicks on Confirm one-time passcode")
    public void the_user_clicks_on_confirm_one_time_passcode() {
        lp.clickOnConfirmPasscode();
    }
    @Then("the user should be redirected to the My Account page")
    public void the_user_should_be_redirected_to_the_my_account_page() {
        myacc=new MyAccountPage(BaseClass.getDriver());
        boolean targetPage=myacc.verifyDashboardTxt();
        Assert.assertEquals(targetPage,true);
    }
    @Then("the user should see their account dashboard")
    public void the_user_should_see_their_account_dashboard() {
        boolean logoutBtn=myacc.verifyLogoutBtn();
        Assert.assertEquals(logoutBtn,true);

    }


}
