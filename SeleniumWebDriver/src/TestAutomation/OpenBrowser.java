package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//Open url into browser
		driver.get("http://newtours.demoaut.com/");
		
		
		WebElement userid = driver.findElement(By.name("userName"));
		userid.sendKeys("tutorial");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("tutorial");
		
		//driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		
		//close the browser
		driver.close();
		
		//close webdriver
		driver.quit();
		
	}

}
