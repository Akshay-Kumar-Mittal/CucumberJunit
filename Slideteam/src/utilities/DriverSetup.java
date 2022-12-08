package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class DriverSetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public BaseClass baseClass;
	
	public DriverSetup() throws IOException {
		baseClass = new BaseClass();
		pageObjectManager = new PageObjectManager(baseClass.webDriverManager());  // to remove new keyword from everywhere we create object of PageObjectManager class
	}

}
