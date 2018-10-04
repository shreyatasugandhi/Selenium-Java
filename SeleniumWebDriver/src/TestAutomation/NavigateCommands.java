package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		//Open url
		driver.get("http://newtours.demoaut.com/");
		
		//######### Navigate Commands ##########
		   //navigate to the url
		     driver.navigate().to("https://www.facebook.com/");	     
		     
		     String text = driver.getTitle();
		     System.out.println(text);
		     
		   //navigate backward in browser
		     driver.navigate().back();
		     
		     //navigate forward in browser
		     driver.navigate().forward();
		     
		   //refresh the page
		     driver.navigate().refresh();
		     
		     //Close browser and destroy the driver instance
		     driver.close();
		     driver.quit();



	}

}
