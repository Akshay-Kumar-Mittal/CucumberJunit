package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import utilities.DriverSetup;

public class PricingPageStepDefinition {
	
	DriverSetup driverSetup;
	
	public PricingPageStepDefinition(DriverSetup driverSetup) {
		this.driverSetup = driverSetup;
	}
	
	@Then("User redirects on Pricing page")
	public void user_redirects_on_pricing_page() {
		String actualPricingPageTitle = driverSetup.pageObjectManager.driver.getTitle();
	   Assert.assertEquals(actualPricingPageTitle, driverSetup.expPricingPageTitle);
	}

}


