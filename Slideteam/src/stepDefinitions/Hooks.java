package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
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

}
