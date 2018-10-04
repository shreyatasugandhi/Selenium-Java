package TestAutomation;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class TestNGLoginclass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void SetUp(){
		
		//Create instance of WebDriver
		driver = new FirefoxDriver();
		
		//Open url into browser
		driver.get("http://newtours.demoaut.com/");
		//declare actual and expected outcome
		assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
	}
	
	@Test
	public void Login(){
		//Enter username
			WebElement username = driver.findElement(By.name("userName"));
			username.clear();
			username.sendKeys("tutorial");
			
			//Enter password
			WebElement password = driver.findElement(By.name("password"));
			password.clear();
			password.sendKeys("tutorial");
			
			//click on sign-in button
			driver.findElement(By.name("login")).click();
			
			try{
				   Thread.sleep(50000);
				  }catch (InterruptedException ie1) {
				    ie1.printStackTrace();
				  } 
			
	
			//declare actual and expected outcome
			String expectedTitle2 = "Find a Flight: Mercury Tours:";
	        String actualTitle2 = "";
	        
	        try{
				   Thread.sleep(50000);
				  }catch (InterruptedException ie1) {
				    ie1.printStackTrace();
				  } 
			
			
	        // get the actual value of the title
			actualTitle2 = driver.getTitle();
	
			if (actualTitle2.contentEquals(expectedTitle2)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	
		
	}
	
	@AfterTest
	public void CleanUp(){
		//Click on Sign off link
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
		//close the browser
		driver.close();
		
		//Quit all the browser driver
		driver.quit();

		
	}
	

}
