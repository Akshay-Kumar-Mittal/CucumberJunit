package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;
import pageObjects.PricingPageObjects;
import pageObjects.SignUpPageObjects;

public class PageObjectManager{
	
	public WebDriver driver;
	public HomePageObjects homePageObjects;
	public SignUpPageObjects signUpPageObjects;
	public PricingPageObjects pricingPageObjects;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePageObjects getHomePageObject()
	{
		homePageObjects = new HomePageObjects(driver);
		return homePageObjects;
	}
	
	public SignUpPageObjects getSignUpPageObject()
	{
		signUpPageObjects = new SignUpPageObjects(driver);
		return signUpPageObjects;
	}
	
	public PricingPageObjects getPricingPageObject()
	{
		pricingPageObjects = new PricingPageObjects(driver);
		return pricingPageObjects;
	}

}
