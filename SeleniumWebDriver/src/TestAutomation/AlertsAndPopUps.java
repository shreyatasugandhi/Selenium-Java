package TestAutomation;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopUps {
	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//open url
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		
		//########### JavaScript Alert ########//
		
		// This step will result in an alert on screen
		driver.findElement(By.xpath(".//button[contains(text(), 'Click for JS Alert')]")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is ----" + alertText);
		simpleAlert.accept();
		assertEquals(driver.findElement(By.id("result")).getText(), "You successfuly clicked an alert");
	
		
		
		
		
		//####### Confirmation popup ##### //
		
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath(".//button[@onclick='jsConfirm()']"));
		element.click();
		
		//switching to the confirmation
		Alert confirmationAlert = driver.switchTo().alert();
		
		//getting the text of the confirmation pop-up
		String confirmationText = confirmationAlert.getText();
		
		// printing text of the confirmation
		System.out.println("Confirmation text is ---" + confirmationText);
		
		
		//click OK button on the confirmation box
		confirmationAlert.accept();
		
		//Validating the result
		assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Ok");
		
		//printing result on console
		System.out.println(driver.findElement(By.id("result")).getText());
		
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//clicking on button
		element.click();
		
		//switing to the alert
		Alert confirmationAlert2 = driver.switchTo().alert();
		
		//click Cancel button on the confirmation box
		confirmationAlert2.dismiss();
		
		//validating result
		assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");
		System.out.println(driver.findElement(By.id("result")).getText());
		
	
		
		//####### Prompts ######//

		// locate button & click on it
		driver.findElement(By.xpath(".//button[@onclick='jsPrompt()']")).click();
		
		// switch to the prompt
		Alert prompt = driver.switchTo().alert();
		
		// get the text from prompt
		System.out.println(prompt.getText());
		
		// type into prompt textbox
		prompt.sendKeys("Hello");
		
		// clicking on OK button
		prompt.accept();
		
		//validating entered text in result
		assertEquals(driver.findElement(By.id("result")).getText(), "You entered: Hello");

		
		
		//Close driver
		//driver.quit();
	
	}

}
