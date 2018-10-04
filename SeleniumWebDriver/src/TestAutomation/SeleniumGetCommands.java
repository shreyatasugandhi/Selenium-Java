package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGetCommands {

	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		driver.get("http://newtours.demoaut.com/");
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
  		WebElement register = ewait.until(ExpectedConditions.
  			elementToBeClickable(By.linkText("REGISTER")));
  		register.click();
		
  		
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//############ Get Command #############
		 //get current URL
	     String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	     
	     
	     
	     //get page source
	     String PageSource = driver.getPageSource();
	     System.out.println(PageSource);
	     
	     
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     //Get the text from the page
	     WebElement username = driver.findElement(By.name("userName"));
	     username.sendKeys("tutorial");
	     String userID = username.getText();
	     System.out.println(userID);
	     
	     
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     
	     // get the attribute of element
	     driver.get("http://zero.webappsecurity.com/");
	     System.out.println(driver.getCurrentUrl());
	     
	     WebElement signinbutton = driver.findElement(By.id("signin_button")); 
	     
	     String attribute = signinbutton.getAttribute("class");
	     System.out.println(attribute);

	     
	     
	     driver.get("http://newtours.demoaut.com/");
	     
	     
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

	     //Close browser and destroy the driver instance
	     driver.close();
	     //driver.quit();


	}

}
