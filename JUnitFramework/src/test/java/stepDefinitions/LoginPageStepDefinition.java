package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import pageObjects.PageObjectManager;
import utilities.DriverSetup;

public class LoginPageStepDefinition {
	
	DriverSetup driverSetup;
	public LoginPageObjects loginPageObjects;
	public PageObjectManager pageObjectManager;
	
	public LoginPageStepDefinition(DriverSetup driverSetup) {
		this.driverSetup = driverSetup;
		this.loginPageObjects = driverSetup.pageObjectManager.getLoginPageObject();
	}
	
	@When("Enter Email {string} and Password {string}")
	public void enter_email_and_password(String email, String pass) {
		loginPageObjects.enterEmailId(email);
		loginPageObjects.enterPassword(pass);
	}
	
	@When("Click on Login button")
	public void click_on_login_button() {
		loginPageObjects.clickOnLoginButton();
	}

}


