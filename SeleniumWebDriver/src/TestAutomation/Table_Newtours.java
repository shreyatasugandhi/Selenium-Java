package TestAutomation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Newtours {
	public static void main(String[] args) {
		//initiate webdriver
		WebDriver driver = new FirefoxDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open url
		driver.get("http://newtours.demoaut.com/");
		
		//Login
		WebElement element = driver.findElement(By.name("userName"));
		element.clear();
	    element.sendKeys("tutorial");
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tutorial");

	    driver.findElement(By.name("login")).click();
		
	    
	    //Search flight
	    driver.findElement(By.name("findFlights")).click();
	    	    
	    
		//store value from cell in the string variable
		String sCellValue = driver.findElement(By.xpath("//tr[7]/td[2]/font/b")).getText();
		System.out.println(sCellValue);
		
		
		// click on link of first row and last column
		driver.findElement(By.xpath("(.//input[@name='outFlight'])[3]")).click();
		System.out.println("Redio button has been click and flight is selected");
		
	}
}