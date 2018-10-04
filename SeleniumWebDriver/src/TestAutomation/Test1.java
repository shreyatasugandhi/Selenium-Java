package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		//Create an instance of the firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//Navigate to the url
		driver.get("http://www.facebook.com/");
		
		// Find by css=#id
	    WebElement css1 = driver.findElement(By.cssSelector("#email"));
	    css1.clear();
	    css1.sendKeys("shreyata");
	    
	    // Find by css=tag#id
	    WebElement css2 = driver.findElement(By.cssSelector("input#email"));
	    css2.clear();
	    css2.sendKeys("s");
	    
	    // Find by css=tag.class
	    WebElement css3 = driver.findElement(By.cssSelector("input.inputtext"));
	    css3.clear();
	    css3.sendKeys("ss");
	    
	    // Find by css=tag[attribute="value"]
	    WebElement css4 = driver.findElement(By.cssSelector("input[name=\"email\"]"));
	    css4.clear();
	    css4.sendKeys("sddf");
	    
	    // Find by css=tag.class[attribute="value"]
	    WebElement css5 = driver.findElement(By.cssSelector("input.inputtext[tabindex=\"1\"]"));
	    css5.clear();
	    css5.sendKeys("fine");
	    
	    // type | css=tag[attribute="value"]
	    WebElement css6 = driver.findElement(By.cssSelector("input[type=\"email\"]"));
	    css6.clear();
	    css6.sendKeys("kokok");
	    
	    // Find by css=tag[attribute="value"]
	    WebElement css7 = driver.findElement(By.cssSelector("input[class=\"inputtext\"]"));
	    css7.clear();
	    css7.sendKeys("ssssss");
		
	   
		 // Close the driver
	     driver.quit();
	     


	}

}
