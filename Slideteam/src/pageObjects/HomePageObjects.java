package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	
	public WebDriver driver; // Global variable
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;  // Here "driver" object have the reference of driverSetup.driver 
	}
	
	By signUpButton = By.linkText("Sign up");
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

	
	public void clickOnSignUpButton() {
		driver.findElement(signUpButton).click();
	}

}
