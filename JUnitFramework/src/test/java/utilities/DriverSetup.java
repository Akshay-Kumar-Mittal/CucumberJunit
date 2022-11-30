package utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

public class DriverSetup {
	
	// Objects which we want to share in another files
	public WebDriver driver;
	public String expPricingPageTitle = "Pricing";
	public PageObjectManager pageObjectManager;
	public BaseClass baseClass;
	
	public DriverSetup() throws IOException {
		baseClass = new BaseClass();
		pageObjectManager = new PageObjectManager(baseClass.webDriverManager());  // to remove new keyword from everywhere we create object of PageObjectManager class
	}

}
