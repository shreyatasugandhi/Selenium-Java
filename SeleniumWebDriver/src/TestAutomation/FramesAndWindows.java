package TestAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndWindows {

	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//######### Working with iFrames ########//
		driver.get("http://the-internet.herokuapp.com/iframe");
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("mce_0_ifr"));

		//now use the switch command
		driver.switchTo().frame(iframeElement);

//		// using index of iframe
//		driver.switchTo().frame(0);

		//enter text
		driver.findElement(By.id("tinymce")).sendKeys("Found iframe successfully!");
		
		//Switch back to the main window
		driver.switchTo().defaultContent();
		
		//#### working with windows #######//
		
        // Launch the URL

        driver.get("http://the-internet.herokuapp.com/windows");

        // Store and Print the name of the First window on the console

        String handle= driver.getWindowHandle();

        System.out.println(handle);

        // Click on the Button "New Message Window"

        driver.findElement(By.linkText("Click Here")).click();

        // Store and Print the name of all the windows open	              

        Set <String> handles = driver.getWindowHandles();

        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}
        
        // Closing Pop Up window

        driver.close();

        // Close Original window

        driver.quit();
		
	}

}
