package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.UseOfWebsitePage;

public class UseOfWebsiteSteps {

    WebDriver driver;
    HomePage hp;
    UseOfWebsitePage up;

    public UseOfWebsiteSteps()
    {
        this.driver=BaseClass.getDriver();
        this.hp = new HomePage(driver);
        this.up = new UseOfWebsitePage(driver);
    }

    @When("the customer clicks on the Usage of this website link from footer")
    public void the_customer_clicks_on_the_usage_of_this_website_link_from_footer() {
        BaseClass.getLogger().info("Navigating to homepage");
        hp.clickUseOfWebsiteLnk();
    }
    @Then("the customer should be redirected to the website usage page")
    public void the_customer_should_be_redirected_to_the_website_usage_page() throws InterruptedException {
        Thread.sleep(5000);
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.lycamobile.us/en/use-of-this-website/");

    }
    @Then("the website usage page should display details of Website Usage Statistics")
    public void the_website_usage_page_should_display_details_of_website_usage_statistics() {
        boolean txt=up.textExist();
        Assert.assertEquals(txt,true);

    }



}
