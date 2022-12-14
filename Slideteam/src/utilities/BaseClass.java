package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;
public PageObjectManager pageObjectManager;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//resources//ApplicationProperties.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		if(driver == null) 
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			}
			else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
			    driver = new FirefoxDriver();
			}
			else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();
			}
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get(prop.getProperty("url"));
		}
	    return driver;
	}
	
	@BeforeClass
	public void initializeObjects() {
		pageObjectManager = new PageObjectManager(driver);
	}
	
//	@After
//	public void AfterScenario()
//	{
//		driver.quit();
//	}
	

}
