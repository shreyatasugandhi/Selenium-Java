package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxSelectboxButtonsRadioButtons {

	public static void main(String[] args) {
		
		//set system property
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		//Initiate Chrome driver
		WebDriver driver = new ChromeDriver();

		//######## Implicit wait ################
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	    
		 // open url 
	    driver.get("http://newtours.demoaut.com/");
	    
	    /////////Login
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
	    
  		  		
	  //Select one way radio button
	    WebElement triptype = driver.findElement(By.xpath(".//*[@value='roundtrip']"));

	    boolean selected = triptype.isSelected();
	    
//	    boolean enabled = triptype.isEnabled();
//	    
//	    boolean displayed = triptype.isDisplayed();
	    
	    
	    if(selected){
	    	System.out.println("Round trip is selected");
	    	 driver.findElement(By.xpath(".//*[@value='oneway']")).click();
	     }
	     else {
	    	 System.out.println("Round trip was not selected by default. Test Failed");
	    	 triptype.click();
	    	 driver.findElement(By.xpath(".//*[@value='oneway']")).click();
	     }
	    
	        
	    
	    // click findFlights button to navigate to the next page 
	    driver.findElement(By.name("findFlights")).click();
	    
	    
	    // click on reserveFlights button to navigate to the next page 
	    driver.findElement(By.name("reserveFlights")).click();
	    
	    // Fill the form
	    driver.findElement(By.name("passFirst0")).clear();
	    driver.findElement(By.name("passFirst0")).sendKeys("Shreyata");
	    driver.findElement(By.name("passLast0")).clear();
	    driver.findElement(By.name("passLast0")).sendKeys("Sugandhi");
	    
	    
	    //##### Select element ######
	    // Select meal type
	    Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
	    
	    meal.selectByVisibleText("Low Sodium");
//	    meal.selectByValue("KSML");
//	    meal.selectByIndex(4);
//	    meal.deselectByValue("KSML");
	    	    
	    System.out.println(meal.getFirstSelectedOption()); /// ==> Low Sodium
	    
	    
	    boolean mealtype = meal.equals("Low Sodium");
	    	    
	    
	    if(mealtype){
	    	 System.out.println("Selected");
	     }
	     else {
	    	 System.out.println("Select did not work");
	     }
	    
	    	    
	    
	    // type creditnumber 
	    driver.findElement(By.name("creditnumber")).clear();
	    driver.findElement(By.name("creditnumber")).sendKeys("123456789");
	    
	    
	    
	    // Check the checkbox ticketLess  
	    WebElement ticketlesscheckbox = driver.findElement(By.name("ticketLess"));
	    
	    boolean checked = ticketlesscheckbox.isSelected();
	    
	    if(!checked){
	    	ticketlesscheckbox.click();
	    	System.out.println("Checkbox was not checked by default. But I checked it now.");
	    	
	    }else{
	    	System.out.println("Checkbox is already checked");
	    }
	    
	    
	    
	    // Check the checkbox Same as Billing Address  
	    WebElement addresscheckbox = driver.findElement(By.xpath(".//tbody/tr[14]/td[2]/input[@name='ticketLess']"));
	    
	    boolean isDisplayed = addresscheckbox.isDisplayed();
	    if(isDisplayed){
	    	System.out.println("Checkbox is displayed");
	    	boolean isEnabled = addresscheckbox.isEnabled();
		    if(isEnabled){
		    	System.out.println("Checkbox is enabled");
		    	boolean isChecked = addresscheckbox.isSelected();	    
			    if(!isChecked){
			    	addresscheckbox.click();
			    	System.out.println("Checked the checkbox.");
			    }else{
			    	System.out.println("Checkbox is already checked");
			    }
		    }else{
		    	System.out.println("Checkbox is not enabled");
		    }
	    }else{
	    	System.out.println("Checkbox is not displayed");
	    }
	    
	       
	    // click on buyFlights button to book a flight 
	    driver.findElement(By.name("buyFlights")).click();
	    
	    //Quit the driver
	    driver.quit();
	    
	}

}
