package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String[] args) {
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//##### Mouse right click ########
		//open URL into browser
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		//identify element
		WebElement button = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/p/span"));
		
		// right click on button
		act.contextClick(button).build().perform();
		
		//select the option
		driver.findElement(By.xpath("html/body/ul/li[3]/span")).click();
		
		
		//switch to alert and get the text
		System.out.println(driver.switchTo().alert().getText());
		
		//close alert
		driver.switchTo().alert().accept();
		
		
		
		// close browser
		driver.close();
		
		//quit driver
		driver.quit();
				
				
	}

}
