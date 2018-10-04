package TestAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// ######## Maximize window  ########
		driver.manage().window().maximize();
				
		
		// open url
		driver.get("http://newtours.demoaut.com/");

		
		
		// ############ Get all links using FindElements #########	
		
		String underConstructionTitle = "Under Construction: Mercury Tours";
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
        String[] linkTexts = new String[links.size()];
        
        int i = 0;

        //extract the link texts of each link element
        for (WebElement l : links) {
            linkTexts[i] = l.getText();
            System.out.println(linkTexts[i]);
            i++;
        }
        
        

        //test each link
        for (String lt : linkTexts) {
        	if(lt == "Register \n                    here"){
        		driver.findElement(By.xpath(".//a[contains(text(), 'Register ')]")).click();
        	}else{
	            driver.findElement(By.linkText(lt)).click();
	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	            
	            if (driver.getTitle().equals(underConstructionTitle)) {
	                System.out.println("\"" + lt + "\""
	                        + " is under construction.");
	            } else {
	                System.out.println("\"" + lt + "\""
	                        + " is working.");
	            }
	            
	            driver.navigate().back();

	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        	}
        }
               
        
        //Destroy the driver
        driver.quit();

	}

}
