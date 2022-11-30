package stepDefinitions;


import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import pageObjects.PageObjectManager;
import utilities.DriverSetup;

public class HomePageStepDefinition {
	
	DriverSetup driverSetup;  //Global variable
	public PageObjectManager pageObjectManager;
	public HomePageObjects homePageObjects;
	
	//Constructor of HomePageStepDefinition with instance of DriverSetup class as parameter
	public HomePageStepDefinition(DriverSetup driverSetup) {
		this.driverSetup = driverSetup;
		this.homePageObjects = driverSetup.pageObjectManager.getHomePageObject();
	}
	
	@Given("User is on home page of the application")
	public void user_is_on_home_page_of_the_application() throws IOException {
		Assert.assertTrue(homePageObjects.getHomePageTitle().contains("PowerPoint Templates")); //PowerPoint Templates
	}
	
	@When("User clicks on Sign In button")
	public void user_clicks_on_sign_in_button() {
		homePageObjects.clickOnSignInButton();
	}

}


