package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		// We have to create Screen class object to access method
		
		Screen screen = new Screen();
		
		// Create object of Pattern class and specify the images path		
		Pattern image = new Pattern("C:\\images\\gmail.PNG");		
		Pattern image1 = new Pattern("C:\\images\\username.PNG");		
		Pattern image2 = new Pattern("C:\\images\\password.PNG");		
		Pattern image3 = new Pattern("C:\\images\\next.PNG");		
		Pattern image4 = new Pattern("C:\\images\\signIn.PNG");
		
		// create an object of webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://www.google.com");
				
		screen.wait(image, 10);
		
		// using screen object we can call click method which will accept image path and will perform //action
		// This will click on gmail image on google home page
		screen.click(image);
		
		screen.wait(image4, 10);
		screen.click(image4);
		
		// using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.
		// This  will type on username field
		screen.wait(image1, 10);
		screen.type(image1, "shreyata@gmail.com");
		
		// This will click on next button
		screen.click(image3);
				
		screen.wait(image2, 10);
		//This will type of password field
		screen.type(image2, "password123");
		
		// This will click on login button
		screen.click(image3);
		
		driver.quit();
	
	}

}