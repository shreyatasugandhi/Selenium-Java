package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		//// Find by css=#id
		//Enter text in email field
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("jhjkh");
		
		
		/// Find by css=tag#id
		//Enter email id into email textbox
		driver.findElement(By.cssSelector("input#email")).clear();
		driver.findElement(By.cssSelector("input#email")).sendKeys("shreyata");
		
					
		//// Find by css=tag.class
		WebElement e1 = driver.findElement(By.cssSelector("input.inputtext"));
		e1.clear();		
		e1.sendKeys("Sugandhi");
		
		//// Find by css=tag[attribute='value']
		WebElement e2 = driver.findElement(By.cssSelector("input[type='email']"));
		e2.clear();
		e2.sendKeys("stersgtre");
		
		
		//// Find by css=tag.class[attribute='value']
		WebElement e3 = driver.findElement(By.cssSelector("input.inputtext[type='password']"));
		e3.clear();
		e3.sendKeys("Shreyata");
		
		
		//close driver
		driver.close();
		driver.quit();

	}

}
