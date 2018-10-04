package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkingWithMultipleBrowser {

	public static void main(String[] args) throws Exception {
		
		//Declare webdriver 
		WebDriver driver;
		
		 String browser = "ie";
	        
		
		//Check if broser = 'firefox'
       if(browser.equalsIgnoreCase("firefox")){
    	   
    	   System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowserDrivers\\geckodriver.exe");
    	       	      	   
    	   //create firefox instance
           driver = new FirefoxDriver();
           
        }

        //Check if browser = 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){
        	
            //set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
    		String service = "C:\\SeleniumBrowserDrivers\\chromedriver.exe";
    		System.setProperty("webdriver.chrome.driver", service);

            //create chrome instance
            driver = new ChromeDriver();
            
        }
       
       //Check if browser = 'ie'
        else if(browser.equalsIgnoreCase("ie")){
        	String service = "C:\\SeleniumBrowserDrivers\\IEDriverServer.exe";
        	System.setProperty("webdriver.ie.driver", service);

        	//create IE instance
        	driver = new InternetExplorerDriver();
        	
        }
       
       //If no browser declared then
        else{
            throw new Exception("Browser is not declared");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		// open url
		driver.get("http://newtours.demoaut.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
     
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
     
	     //Close browser
	     driver.close();
     

	}

}
