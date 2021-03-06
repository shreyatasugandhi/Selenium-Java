package TestAutomation;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginWithTestNG {
	
	public WebDriver driver;

	 @BeforeTest
	 public void Setup() {
		 		 
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		driver = new ChromeDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//maximize the window
			driver.manage().window().maximize();
			  
			//Open url into browser
			driver.get("http://newtours.demoaut.com/");
			assertEquals(driver.getTitle(), "Welcome: Mercury Tours");

	 }
	  
	
	  @Test
	  public void Login() {
		  
			//Enter username
			WebElement username = driver.findElement(By.name("userName"));
			username.clear();
			username.sendKeys("tutorial");
			
			//Enter password
			WebElement password = driver.findElement(By.name("password"));
			password.clear();
			password.sendKeys("tutorial");
			
			//click on sign-in button
			driver.findElement(By.name("login")).click();	
			assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
			
			assertTrue(isElementPresent(By.xpath("//td/table/tbody/tr/td[2]/table/tbody/tr/td/img")));
			
	  }
	  
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
	  
  
	@AfterTest
	public void CleanUp() {

			//Click on Sign off link
			driver.findElement(By.linkText("SIGN-OFF")).click();
		
			//close the browser
			driver.close();
			
			//Quit all the browser driver
			driver.quit();
		  
	}

}
