package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn_steps {
	
	public static WebDriver driver;
	
	@Given("^I should be able to launch the ZeroBank app$")
	public void LaunchZeroBankApp() throws Throwable {
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open URL into browser
		driver.get("http://zero.webappsecurity.com/");
	   
	}
	
	@Given("^I should be on 'Home Page'$")
	public void validateHomePage() throws Throwable {
		assertEquals("Zero - Personal Banking - Loans - Credit Cards", driver.getTitle());
		   
	}
	
	@Given("^I click on 'SginIn' button$")
	public void clickOnSignInButton() throws Throwable{
		driver.findElement(By.id("signin_button")).click();
	}
	
	@Given("^I land on 'LogIn' page$")
	public void validateLogInPage() throws Throwable {
		assertEquals("Zero - Log in", driver.getTitle());
		   
	}
	
	@When("^I enter login Id as \'(.*)\'$")
	public void enterUsername(String username) throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys(username);	    
	}

	@When("^I enter password as \'(.*)\'$")
	public void enterPassword(String password) throws Throwable {
		driver.findElement(By.id("user_password")).sendKeys(password);	    
	}

	@When("^I click on 'Sign In' button$")
	public void clickOnSignIn() throws Throwable {
		driver.findElement(By.name("submit")).click();
	}

	@Then("^I should be able to log into the ZeroBank app and land on 'User Home Page'$")
	public void validateLogIn() throws Throwable {
		assertEquals("Zero - Account Summary", driver.getTitle());
	}

}
