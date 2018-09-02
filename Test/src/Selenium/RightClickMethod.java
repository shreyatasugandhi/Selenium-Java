package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	
	public static void main(String[] args) {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//open URL into browser
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Create actions class object
		Actions act = new Actions(driver);
		
		
		//identify button
		WebElement button = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/p/span"));
		
		// perform right click on button
		act.contextClick(button).build().perform();
		
		//select copy option and click on it
		driver.findElement(By.xpath("html/body/ul/li[3]/span")).click();
		
		//verify 
		
		
		
		
		
		
		
		//quit driver
		driver.quit();
		
		
		
	}

}
