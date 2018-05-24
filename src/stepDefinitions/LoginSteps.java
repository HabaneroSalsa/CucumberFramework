package stepDefinitions;

import components.CommonFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
	CommonFunctions common;
	Scenario scenario;
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("^the browser is at the Online Store page$")
	public void browser_at_online_store_page() throws Throwable { 
		// go to url
		loginPage.openTestURL();		
		// validate page presence
	}
	
	@When("^the user logs into site$")
	public void user_logs_into_site() throws Throwable {
		// authenticate
		
		// validate success
	}
	
	@Then("^a screenshot is saved to the report$")
	public void screenshot_saved_to_report() throws Throwable {
		common.embedScreenShotInCucumberReport(driver, scenario);
	}
}
