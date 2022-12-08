package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPageObjects {
	
	public WebDriver driver; // Global variable
	
	public PricingPageObjects(WebDriver driver) {
		this.driver = driver;  // Here "driver" object have the reference of driverSetup.driver 
	}
	
	public String getPricingPageTitle() {
		return driver.getTitle();
	}

}
