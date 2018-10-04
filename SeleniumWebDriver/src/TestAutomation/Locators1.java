package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		/////     Find by ID  /////
		//enter e-mail id into the textbox
		driver.findElement(By.id("email")).sendKeys("shreyata.s@ss.com");
		
		
		//////    Find by Name /////
		//enter the password
		driver.findElement(By.name("pass")).sendKeys("12345");
			
		/////   Find by className 
		//Enter email
		WebElement element = driver.findElement(By.className("inputtext"));
		
		element.clear();
		element.sendKeys("Shreyata");		
		
		
		///// Find Element by LinkText
		//Click on "Forgot account?"
		driver.findElement(By.linkText("Forgot account?")).click();		
		
		
		
		//// Find by partialLinkText
		//Click on "I can't identify my account"
		driver.findElement(By.partialLinkText("Forgot")).click();
		

		//close driver
		driver.close();
		driver.quit();
			
	}

}
