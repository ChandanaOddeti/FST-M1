package Activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity7 {
	WebDriver driver;
    WebDriverWait wait;
 
  @BeforeClass
  public void beforeClass()  {
      // Set up the Firefox driver
      WebDriverManager.firefoxdriver().setup();
      // Initialize Firefox driver object
      driver = new FirefoxDriver();
      // Initialize wait object
      wait = new WebDriverWait(driver,Durationof(10));
      
      //Open browser
      driver.get("https://v1.training-support.net/selenium/login-form");
  }

 private Duration Durationof(int i) {
	// TODO Auto-generated method stub
	return null;
}

@DataProvider(name = "Authentication")
 public static Object[][] creds() {
	 return new Object [][] { { "admin", "password"}};
	 
 }
@Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
 
    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
 
}