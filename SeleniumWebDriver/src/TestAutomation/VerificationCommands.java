package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationCommands {

	public static void main(String[] args) {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open url
		driver.get("http://newtours.demoaut.com/");
		
		 //IsDisplayed
	     WebElement element = driver.findElement(By.name("userName"));
	     boolean status = element.isDisplayed();
	     System.out.println(status);
	     	     

	     //IsEnabled
	     boolean isenabled = element.isEnabled();
	     // Check that if the Text field is enabled, if yes enter value
	     if(isenabled){
	         element.sendKeys("tutorial");
	     }
		
	     
	     //Login
		element.clear();
	    element.sendKeys("tutorial");
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tutorial");

	    driver.findElement(By.name("login")).click();
	     
	     
	     //IsSelected
	     WebElement triptype = driver.findElement(By.xpath(".//*[@value='roundtrip']"));
	     boolean selected = triptype.isSelected();
	     if(selected){
	    	 driver.findElement(By.xpath(".//*[@value='oneway']")).click();
	     }
	     
	     
	     //Close browser and destroy the driver instance
	     driver.close();
	     driver.quit();

	  
	}

}
