package TestAutomation;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionsAndVerifications {

	public static void main(String[] args) {
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
	//Open url into browser
	driver.get("http://newtours.demoaut.com/");

	//######### Assertion #################
	String expectedTitle = "Welcome: Mercury Tours";
	assertEquals(driver.getTitle(), expectedTitle);
	
		
	// Either
	WebElement element = driver.findElement(By.name("userName"));
	element.sendKeys("tutorial");
	//String text = element.getText();
	String text = element.getAttribute("value");

	System.out.println(element.getAttribute("type"));
	System.out.println(element.getAttribute("size"));
	
	assertEquals(text, "tutorial");
		
	
	
	//########### Verification ############
	
	try {
		assertEquals(driver.getTitle(), expectedTitle);
	} catch (Exception e) {
		e.printStackTrace(); 
	}
	
	
	//close the browser
	driver.quit();
				
				

	}

}