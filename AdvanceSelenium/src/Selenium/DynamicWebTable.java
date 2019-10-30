package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Create instance of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		
		//maximize the window
		driver.manage().window().maximize();

		// enter URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
		
		//Login to the application
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		
		// identify elements
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermgt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));
				
				
		// perform actions on elements one by one
		act.moveToElement(admin).build().perform();  // mouse hover on admin menu
		Thread.sleep(500);
		act.moveToElement(usermgt).build().perform(); // mouse hover on user management submenu
		Thread.sleep(500);
		act.moveToElement(users).click().build().perform();  // mouse hover and click on users submenu
		Thread.sleep(500);
				
		
//		//table[@id='resultTable']/tbody[1]/tr[2]/td[1]/input[1]
//		//table[@id='resultTable']/tbody[1]/tr[3]/td[1]/input[1]
//		//table[@id='resultTable']/tbody[1]/tr[4]/td[1]/input[1]
//		//table[@id='resultTable']/tbody[1]/tr[4]/td[2]/a[1]
//		//table[@id='resultTable']/tbody[1]/tr[10]/td[1]/input[1]
//		//table[@id='resultTable']/tbody[1]/tr[5]/td[2]/a[1]
//		//input[@id='ohrmList_chkSelectRecord_4']
//		//input[@id='ohrmList_chkSelectRecord_10']
		String before = "//table[@id='resultTable']/tbody[1]/tr[";
		String after  = "]/td[2]/input[1]";
		
		String uname = "john_smith1234";
		int i = 2;
		int count = driver.findElements(By.xpath(before+ i +after)).size();

		for(i=2; i<=count; i++){
			String username = driver.findElement(By.xpath(before+i+after)).getText();
			if (username == uname){
				System.out.println("Username found as" + username);
				WebElement checkbox = driver.findElement(By.xpath(before+i+after.replace("td[2]", "td[1]")));
				checkbox.click();
			}
		}
		
		
		//Method-2:
		driver.findElement(By.xpath("//a[contains(text(),'john_smith1234')]/preceding-sibling::td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'john.smith')]/preceding-sibling::td//input[@type='checkbox']")).click();
		
	}

}
