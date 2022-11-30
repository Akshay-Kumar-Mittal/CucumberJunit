package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPageObjects {
	
	public WebDriver driver;
	
	public PricingPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By SignInButton = By.linkText("Sign In");

	
	public void clickOnSignInButton() {
		driver.findElement(SignInButton).click();
	}
	

}
