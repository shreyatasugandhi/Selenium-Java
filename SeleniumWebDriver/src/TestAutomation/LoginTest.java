package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//Set system properties
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		// create driver object
		WebDriver driver = new ChromeDriver();
		
			
		//Open url into browser
		driver.get("http://newtours.demoaut.com/");
		
		
		//declare actual and expected outcome
		String expectedTitle1 = "Welcome: Mercury Tours";
        String actualTitle1 = "";

		// get the actual value of the title
		actualTitle1 = driver.getTitle();

		if (actualTitle1.contentEquals(expectedTitle1)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		
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
			   Thread.sleep(10000);
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
		
		
		//Click on Sign off link
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
		//close the browser
		driver.close();
		
		//Quit all the browser driver
		driver.quit();


		

	}

}
