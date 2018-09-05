package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetAttribute {
	
	public WebDriver driver;
	
	
	 @BeforeTest
	 public void Setup() {		 		 
			//Create instance of WebDriver
			driver = new ChromeDriver();
			
			//Set system properties
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
			
			//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//maximize the window
			driver.manage().window().maximize();
			
			  
			//Open url into browser
			driver.get("https://opensource-demo.orangehrmlive.com/");

		  	// Assert title
		  	String expectedTitle = "OrangeHRM";
			assertEquals(driver.getTitle(), expectedTitle);
			
	 }
	  
	
	  @Test
	  public void Login() {
		  	
						
			//Enter username
			WebElement username = driver.findElement(By.id("txtUsername"));
			username.clear();
			username.sendKeys("Admin");
			
			//Enter password
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.clear();
			password.sendKeys("admin123");
			
			//click on sign-in button
			WebElement loginbtn = driver.findElement(By.id("btnLogin"));
			String name_login = loginbtn.getAttribute("name");
			
			driver.findElement(By.name(name_login));
			
			//Get the attribute
			System.out.println(name_login);
			System.out.println(loginbtn.getAttribute("class"));
			System.out.println(loginbtn.getAttribute("type"));
			System.out.println(loginbtn.getAttribute("value"));

			
	  }
	  

	@AfterTest
	public void CleanUp() {
		
			//close the browser
			driver.close();
			
			//Quit all the browser driver
			driver.quit();
		  
	}


}
