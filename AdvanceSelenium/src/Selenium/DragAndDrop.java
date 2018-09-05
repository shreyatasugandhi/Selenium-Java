package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//open URL into browser
		driver.get("https://jqueryui.com/droppable/");
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		//switch to the frame
		driver.switchTo().frame(0);
			
		//identify elements
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		//click and hold, move and release
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
		
		//drag and drop method
		act.dragAndDrop(source, target).build().perform();
		
		
		
		
//		// close browser
//		driver.close();
//		
//		//quit driver
//		driver.quit();
//		
	}

}
