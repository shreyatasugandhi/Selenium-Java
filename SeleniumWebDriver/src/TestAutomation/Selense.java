package TestAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selense {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		 //get current URL
	     String CurrentUrl = driver.getCurrentUrl();
	     System.out.println(CurrentUrl);
	     

	     
	     //Get Text
	     String text = driver.findElement(By.linkText("REGISTER")).getText();
	     System.out.println(text);
	     
	     
	     //get page source
	     String PageSource = driver.getPageSource();
	     System.out.println(PageSource);
	     
	     
	     //navigate to the url
	     driver.navigate().to("http://newtours.demoaut.com/");
	     
	     
	     //navigate forward in browser
	     driver.navigate().forward();
	     
	     //navigate backward in browser
	     driver.navigate().back();
	     
	     //refresh the page
	     driver.navigate().refresh();
	     

	     
	     //IsDisplayed
	     WebElement element = driver.findElement(By.name("userName"));
	     boolean status = element.isDisplayed();
	     System.out.println(status);
	     
	     
	     //IsEnabled
	     boolean isenabled = element.isEnabled();
	     // Check that if the Text field is enabled, if yes enter value
	     if(isenabled){
	         element.sendKeys("tutorial");
	     }
	     
	     //Login
		element.clear();
	    element.sendKeys("tutorial");
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tutorial");

	    driver.findElement(By.name("login")).click();
	     
	     
	     //IsSelected
	     WebElement triptype = driver.findElement(By.xpath(".//*[@value='oneway']"));
	     boolean selected = triptype.isSelected();
	     
	     if(!selected){
	    	 triptype.click();
	     }
	     
	     
	     //Submit
	     driver.findElement(By.name("findFlights")).submit(); 
	     
	     
	     //=========================================
	     
	     // Store all the elements of same category in the list of WebLements	

	     List<WebElement>  RadioButton = driver.findElements(By.name("tripType"));

	     // Create a boolean variable which will hold the value (True/False)

	     boolean bValue = false;

	     // This statement will return True, in case of first Radio button is selected

	     bValue = RadioButton.get(0).isSelected();

	     // This will check that if the bValue is True means if the first radio button is selected

	     if(bValue = true){

	    	// This will select Second radio button, if the first radio button is selected by default

	    	RadioButton.get(1).click();

	     }else{

	    	// If the first radio button is not selected by default, the first will be selected

	    	RadioButton.get(0).click();

	     }
	     
	     
	     //clicking on continue button
	     //driver.findElement(By.name("reserveFlights")).click();
	     
	     
	     //// findWlements with value
	     // Find the checkbox or radio button element by Name

	     List<WebElement> radiobuttons = driver.findElements(By.name("servClass"));

	     // This will tell you the number of radiobuttons are present

	     int iSize = radiobuttons.size();

	     // Start the loop from first radiobuttons to last radiobuttons

	     for(int i=0; i < iSize ; i++ ){

	    	 // Store the radiobuttons name to the string variable, using 'Value' attribute

	    	 String sValue = radiobuttons.get(i).getAttribute("value");

	    	 // Select the select it the value of the First is same what you are looking for

	    	 if (sValue.equalsIgnoreCase("Business")){

	    		 radiobuttons.get(i).click();

	    		 // This will take the execution out of for loop

	    		 break;

	    		 }

	    	}	     
	     
	     driver.findElement(By.name("findFlights")).click();
	     driver.findElement(By.name("reserveFlights")).click();
	     
	     ///######################## Select Class ##############///
	     //new Select(driver.findElement(By.name("pass.0.meal"))).selectByVisibleText("Diabetic");
	     
	     // OR 
	     
	     Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
	     meal.selectByVisibleText("Diabetic");
	     meal.selectByIndex(3);
	     meal.selectByValue("LCML");
	     
	     // Select ALL options
	     List <WebElement> mealCount = meal.getOptions();
	 	int iSize1 = mealCount.size();

	 	for(int i =0; i>iSize1 ; i++){
	 		String sValue = mealCount.get(i).getText();
	 		System.out.println(sValue);
	 		}


	     //Close browser and destroy the driver instance
	     driver.close();
	     driver.quit();
	     
	}

}
