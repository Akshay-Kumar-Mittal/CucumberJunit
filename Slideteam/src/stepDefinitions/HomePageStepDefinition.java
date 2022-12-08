package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import utilities.BaseClass;
import utilities.DriverSetup;
import utilities.PageObjectManager;

public class HomePageStepDefinition{
	
	DriverSetup driverSetup;  //Global variable
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
	
	@When("User clicks on Sign Up button")
	public void user_clicks_on_sign_up_button() {
		homePageObjects.clickOnSignUpButton();
	}

}
