package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
				
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
		//open URL into browser
		driver.get("http://the-internet.herokuapp.com/upload");
		
		//identify element
		driver.findElement(By.id("file-upload")).click();
		
		Thread.sleep(1000);
		
		//Run AutoIT
		Runtime.getRuntime().exec("D:\\Work\\Freelance\\Trainings\\Selenium\\Selenium_Java\\AdvanceSelenium\\AutoIT_Script.exe");
		
		Thread.sleep(4000);
		
		
		//Click on upload button
		driver.findElement(By.id("file-submit")).click();
		
		
				
	}

}
