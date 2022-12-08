package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver; // Global variable
	
	public SignUpPageObjects(WebDriver driver) {
		this.driver = driver;  // Here "driver" object have the reference of driverSetup.driver 
	}
	
	By emailAddress = By.id("email_address");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By password = By.id("password");
	By confirmPassword = By.id("password-confirmation");
	By signupButton = By.id("final-submit");
	
	public String getSignUpPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement enterEmailAddress() {
		return driver.findElement(emailAddress);
	}
	
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement enterLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement enterConfirmPassword() {
		return driver.findElement(confirmPassword);
	}

	
	public void clickOnSignUPButton() {
		driver.findElement(signupButton).click();
	}

}
