package com.zerobank.qa.TestCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class LogIn_steps {

	public static WebDriver driver;
	
	@Given("^I am on a log in page$")
	public void OpenApp() throws Throwable {
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open URL into browser
		driver.get("http://zero.webappsecurity.com/");
		driver.findElement(By.id("signin_button")).click();		
	}
	
	@When("^I enter username as \'(.*)\'$")
	public void enterUserName(String username) throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys(username);
		
	}
	
	@When("^I enter username as \'(.*)\'$")
	public void enterPassword(String password) throws Throwable {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	
	@When("^I click on 'LogIn' button$")
	public void clickLogInButton() throws Throwable {
		driver.findElement(By.name("submit")).click();
	}
	
	@Then("^I should be able to log into the application and I should land on Home Page$")
	public void validateHomePage() throws Throwable {
		assertEquals("Zero - Account Summary", driver.getTitle());
	
	}
	
}
