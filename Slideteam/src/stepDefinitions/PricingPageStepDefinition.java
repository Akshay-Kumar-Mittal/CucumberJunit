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
import pageObjects.PricingPageObjects;
import utilities.BaseClass;
import utilities.DriverSetup;
import utilities.PageObjectManager;

public class PricingPageStepDefinition{
	
	DriverSetup driverSetup;  //Global variable
	public PricingPageObjects pricingPageObjects;
	
	//Constructor of HomePageStepDefinition with instance of DriverSetup class as parameter
	public PricingPageStepDefinition(DriverSetup driverSetup) {
		this.driverSetup = driverSetup;
		this.pricingPageObjects = driverSetup.pageObjectManager.getPricingPageObject();
	}
	
	@Then("User redirects on Pricing page")
	public void user_redirects_on_pricing_page() {
		System.out.println(pricingPageObjects.getPricingPageTitle());
//		Assert.assertTrue(pricingPageObjects.getPricingPageTitle().contains("Pricing"));
	}

}
