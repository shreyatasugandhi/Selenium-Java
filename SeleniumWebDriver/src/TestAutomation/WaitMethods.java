package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.NoSuchElementException;
import com.google.common.base.Function;


public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {
		

		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		
		//######## Implicit wait ################
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Maximize window
		driver.manage().window().maximize();
						
		
		// open url
		driver.get("http://newtours.demoaut.com/");
		
		/////////Login
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
  		
  		  		
  		/// ############# Explicit wait #############
  		WebDriverWait ewait = new WebDriverWait(driver, 10);
  		WebElement button = ewait.until(ExpectedConditions.
  			elementToBeClickable(By.name("findFlights")));
  		button.click();

  		
  		
  		
  		/// ############# Fluent wait ###############
  		//declaring fluent wait with time out of 10 
  		//seconds and frequency is set to 100 milliseconds  		
  		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)							
		  		.withTimeout(10, TimeUnit.SECONDS) 			
		  		.pollingEvery(100, TimeUnit.MILLISECONDS) 			
		  		.ignoring(NoSuchElementException.class);	
  		
  		//identifying a web element on the page
  		//with frequency set to 100 milliseconds 		
  		WebElement element = fwait.until(new Function<WebDriver, 
  				WebElement>() {							
  		public WebElement apply(WebDriver driver) { 
  		return driver.findElement(By.name("reserveFlights"));					
  			}		
  		});		
  		  		  		
  		
  		//click on button 		
  		element.click();	 		
		
  		
  		
  		//close webdriver
  		driver.quit();
  		

	}

}
