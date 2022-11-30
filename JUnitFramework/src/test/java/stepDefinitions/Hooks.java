package stepDefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.DriverSetup;

public class Hooks {
	
	DriverSetup driverSetup;
	
	public Hooks(DriverSetup driverSetup) 
	{
		this.driverSetup = driverSetup;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		driverSetup.baseClass.webDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			WebDriver driver = driverSetup.baseClass.webDriverManager();
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(source);
			scenario.attach(fileContent, "image/png", "image");
			
		}
	}


}
