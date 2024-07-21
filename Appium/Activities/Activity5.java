import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Test
public class Activity5 {
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

 // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
    	 UiAutomator2Options options = new UiAutomator2Options();
         options.setPlatformName("android");
         options.setAutomationName("UiAutomator2");
         options.setAppPackage("com.google.android.contacts");
         options.setAppActivity("com.android.contacts.activities.PeopleActivity");
         options.noReset();
         // Server Address
         URL serverURL = new URL("http://localhost:4723/");
  
         // Driver Initialization
         driver = new AndroidDriver(serverURL, options);
         wait = new WebDriverWait (driver, Duration.ofSeconds(10));
    }
    
	
	public void contactsTest() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId(("Create contact"))));
    	driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
    	
    	// Enter the details
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Aaditya");
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Varma");
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("999148292");
    		//Click Save	
    	driver.findElement(By.id("toolbar_button")).click();
    	
    	
    	 // Wait for contact to save
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
 
     // Assertion
        String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
        Assert.assertEquals(contactName, "Aaditya Varma");
    			
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
		


