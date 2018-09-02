package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[] args) throws Throwable {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open URL into browser
		driver.get("https://www.google.com/");
		
		//create object of Actions class
		Actions act = new Actions(driver);
			
		//identify elements
		WebElement search = driver.findElement(By.name("q"));
		
		
		//key stroks
		Action kbEvents = act.keyDown(search, Keys.SHIFT).sendKeys("Java Code Geeks")
				.keyUp(search, Keys.SHIFT).doubleClick().contextClick().build();
		kbEvents.perform();
		act.sendKeys(search, Keys.ENTER);
		act.sendKeys(search, Keys.TAB);
		

		
	}

}
