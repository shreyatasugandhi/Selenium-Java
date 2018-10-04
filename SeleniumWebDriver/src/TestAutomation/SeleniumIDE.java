package TestAutomation;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    // open | http://newtours.demoaut.com/mercurywelcome.php | 
    driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    // assertTitle | exact:Welcome: Mercury Tours | 
    assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
    // click | link=Home | 
    driver.findElement(By.linkText("Home")).click();
    // assertTitle | exact:Welcome: Mercury Tours | 
    assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
    // type | name=userName | tutorial
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("tutorial");
    // type | name=password | tutorial
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("tutorial");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
