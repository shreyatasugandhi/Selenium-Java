package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectAndSubmit {

	public static void main(String[] args) {
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open url
		driver.get("http://newtours.demoaut.com/");
		
		
		//Login
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
		
     
     ///######################## Select Class ##############///
		
	 WebElement fromport = driver.findElement(By.name("fromPort"));
     Select selDestination = new Select(fromport);
     
     selDestination.selectByVisibleText("London");
     selDestination.selectByValue("New York");     
     selDestination.selectByIndex(5); // it will select Portland

     // OR 
     
     new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
     
     
     //########Submit######
     driver.findElement(By.name("findFlights")).submit();
     
   

     //Close browser and destroy the driver instance
     driver.close();
     //driver.quit();


	}

}
