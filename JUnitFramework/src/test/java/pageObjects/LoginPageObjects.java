package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailId = By.id("email");
	By password = By.id("pass");
	By loginButton = By.id("send2");

	
	public void enterEmailId(String email) {
		driver.findElement(emailId).sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}

}
