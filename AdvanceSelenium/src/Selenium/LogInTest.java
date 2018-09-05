package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	public static void main(String[] args) {
				
				/// set up section
				//Set system properties
				System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
				
				// create driver object
				WebDriver driver = new ChromeDriver();
				
				//open URL into browser
				driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");				
				
				
				
						
				
				
				//// Test
				//Enter username
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
				//Enter password
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				
				//Click on logIn button
				driver.findElement(By.id("btnLogin")).click();
				
				
				//click on arrow
				driver.findElement(By.id("welcome")).click();
				
				//click on logout
				driver.findElement(By.linkText("Logout")).click();
				
				
				
				
				/// clean up
				//close browser and driver
				driver.close();
				driver.quit();

	}

}
