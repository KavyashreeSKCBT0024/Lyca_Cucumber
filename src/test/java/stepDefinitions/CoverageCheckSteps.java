package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.CoverageAndServicePage;
import pageObjects.HomePage;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CoverageCheckSteps {

    WebDriver driver;
    HomePage hp;
    CoverageAndServicePage cp;

    public CoverageCheckSteps() {
        // Initialize the WebDriver and page objects here
        this.driver = BaseClass.getDriver(); // Ensure this method retrieves a valid driver instance
        this.hp = new HomePage(driver);
        this.cp = new CoverageAndServicePage(driver);
    }

    @When("I click on the Coverage and Services link in footerr")
    public void i_click_on_the_coverage_and_services_link_in_footerr() {
        BaseClass.getLogger().info("Navigating to homepage");
        hp.acceptCookies();  // Accept cookies if necessary
        hp.clickOnCoverageLnk();  // Click on the Coverage and Services link
    }
    @Then("I should be redirected to the Coverage and Services page")
    public void i_should_be_redirected_to_the_coverage_and_services_page() {

        String mainWindowHandle = driver.getWindowHandle();

        // Wait for the new window to open
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.lycamobile.co.uk/en/help/coverage-and-service/", currentUrl);
    }
    @Then("I should see the title Coverage and Services")
    public void i_should_see_the_title_coverage_and_services() {
        boolean actualTxt = cp.verifyTxt();
        Assert.assertEquals(actualTxt,true);
    }
    @Then("I should see information about coverage options and available services")
    public void i_should_see_information_about_coverage_options_and_available_services() {

    }

}
