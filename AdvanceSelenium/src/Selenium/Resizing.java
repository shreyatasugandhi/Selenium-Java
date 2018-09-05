package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws Throwable {


		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open URL into browser
		driver.get("https://jqueryui.com/resizable/");
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		//switch to the frame
		driver.switchTo().frame(0);
		
		
		
			
		//identify elements
		WebElement resizer = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		
		//resize the box
		act.moveToElement(resizer).dragAndDropBy(resizer, 200, 150).build().perform();
		Thread.sleep(3000);		
		
		
		
	}

}
