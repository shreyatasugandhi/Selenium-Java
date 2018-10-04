package TestAutomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException {

		//initiate webdriver
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("http://the-internet.herokuapp.com/upload");
		
		//Click on browse button
	    driver.findElement(By.id("file-upload")).click();
	    
	    //execute autoIT exe file to upload action
	    Runtime.getRuntime().exec("C:\\images\\AutoIT.exe");
	    
	    // click on upload button
	    driver.findElement(By.id("file-submit")).click();

	   

	}

}
