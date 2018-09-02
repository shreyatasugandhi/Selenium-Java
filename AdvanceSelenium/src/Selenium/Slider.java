package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Throwable {
		

		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//open URL into browser
		driver.get("https://jqueryui.com/slider/");
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		//switch to the frame
		driver.switchTo().frame(0);
		
		
		//identify elements
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

		
		//Move the slider
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		Thread.sleep(3000);		
		
		
		

	}

}
