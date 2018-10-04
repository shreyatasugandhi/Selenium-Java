package TestAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators3 {

	public static void main(String[] args) {

		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("http://newtours.demoaut.com/");
		
		//Login
		driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("tutorial");
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tutorial");

	    driver.findElement(By.name("login")).click();
		
	    
	    ///// Find by xpath
		//click on a round trip radio button
		driver.findElement(By.xpath("//*[@value='roundtrip']")).click();

	
		//navigate facebok page
		driver.navigate().to("https://www.facebook.com/");
		
		
		////#####  XPATH ####/////
		////#####  xpath ####/////
		//Using xpath - text box
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("Shreyata");

	
		//Using xpath with class and index -- select a date
		new Select(driver.findElement(By.xpath(".//*[@class='_5dba'][2]"))).selectByVisibleText("5");
		
		//xpath with contains
		driver.findElement(By.xpath(".//button[contains(text(), 'Up')]")).click();

		driver.findElement(By.xpath(".//a[contains(text(),'Why do I need to provide')]")).click();
	
		//xpath with contains for imgs
		driver.findElement(By.xpath(".//img[contains(@src,'32213527_1720875981299142_7601737152052854784_n.png')]")).click();

		//xpath with value -- Login button
		driver.findElement(By.xpath(".//*[@value='Log In']")).click();
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
		//xpath with value for radio button
		driver.findElement(By.xpath(".//*[@value='1']")).click();

		
		//xpath with select for select box
		new Select(driver.findElement(By.xpath("//select[@aria-label='Day']"))).selectByVisibleText("5");

		
		//xpath with type
		driver.findElement(By.xpath(".//*[@type='password'][@tabindex='2']")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@type='radio'][@value='1']")).click();

		
//		// driver.findElement(By.xpath, '//element[contains[@attribute,'text']]')
//
//		// driver.findElement(By.xpath, '//element[starts-with[@attribute,'text']]')
//
//		// driver.findElement(By.xpath, '//element[ends-with[@attribute,'text']]')

		
	}

}
