package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		//Create instance of WebDriver
		WebDriver driver = new FirefoxDriver();
		
		// open Facebook 
	    driver.get("https://www.facebook.com/");

	    // enter email id
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("ss@123.com");
	    
	    // enter password
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("1234");
	    
	    // click login 
	    driver.findElement(By.id("u_0_q")).click();
	   
	  //declare actual and expected outcome
		String expectedTitle2 = "Log in to Facebook | Facebook";
	     String actualTitle2 = "";
	      
	   // get the actual value of the title
		actualTitle2 = driver.getTitle();

			if (actualTitle2.contentEquals(expectedTitle2)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }


	}

}
