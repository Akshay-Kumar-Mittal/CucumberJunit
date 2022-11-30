package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public HomePageObjects homePageObjects;
	public LoginPageObjects loginPageObjects;
	public PricingPageObjects pricingPageObjects;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePageObjects getHomePageObject() {
		homePageObjects = new HomePageObjects(driver);
		return homePageObjects;
	}
	
	public LoginPageObjects getLoginPageObject() {
		loginPageObjects = new LoginPageObjects(driver);
		return loginPageObjects;
	}
	
	public PricingPageObjects getPricingPageObject() {
		pricingPageObjects = new PricingPageObjects(driver);
		return pricingPageObjects;
	}

}
