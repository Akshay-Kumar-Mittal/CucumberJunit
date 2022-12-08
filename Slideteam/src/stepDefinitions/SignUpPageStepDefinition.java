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
import pageObjects.SignUpPageObjects;
import utilities.BaseClass;
import utilities.DriverSetup;
import utilities.PageObjectManager;

public class SignUpPageStepDefinition{
	
	DriverSetup driverSetup;  //Global variable
	public SignUpPageObjects signUpPageObjects;
	
	//Constructor of HomePageStepDefinition with instance of DriverSetup class as parameter
	public SignUpPageStepDefinition(DriverSetup driverSetup) {
		this.driverSetup = driverSetup;
		this.signUpPageObjects = driverSetup.pageObjectManager.getSignUpPageObject();
	}
	
	@And("Enter following details")
	public void enter_following_details(DataTable dataTable) {
		Assert.assertTrue(signUpPageObjects.getSignUpPageTitle().contains("Create New Customer Account"));
		List<List<String>> data = dataTable.asLists();
		signUpPageObjects.enterEmailAddress().sendKeys(data.get(0).get(0));
		signUpPageObjects.enterFirstName().sendKeys(data.get(0).get(1));
		signUpPageObjects.enterLastName().sendKeys(data.get(0).get(2));
		signUpPageObjects.enterPassword().sendKeys(data.get(0).get(3));
		signUpPageObjects.enterConfirmPassword().sendKeys(data.get(0).get(4));
	}
	
	@And("Click on Sign Up button")
	public void click_on_sign_up_button() {
		signUpPageObjects.clickOnSignUPButton();
	}

}
