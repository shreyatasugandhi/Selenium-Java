package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;

public class MouseHover {

	public static void main(String[] args) throws Throwable {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//open URL into browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		//Login to the application
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		

		//create object of Actions class
		Actions act = new Actions(driver);
		

		
		// identify elements
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermgt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));
				
		
//		
//		// per actions on elements one by one
//		act.moveToElement(admin).build().perform();  // mouse hover on admin menu
//		Thread.sleep(2000);
//		
//		act.moveToElement(usermgt).build().perform(); // mouse hover on user management submenu
//		Thread.sleep(2000);		
//		
//		act.moveToElement(users).click().build().perform();  // mouse hover and click on users submenu
//		
		
		
		// mouse hover action series into single statement
		act.moveToElement(admin).moveToElement(usermgt).moveToElement(users).click().build().perform();
		
		
		// close browser
		driver.close();
		
		//quit driver
		driver.quit();

	}

}
