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
public class Activity6 {
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
         options.setAppPackage("com.google.android.apps.messaging");
         options.setAppActivity(".ui.ConversationListActivity");
         options.noReset();

         // Server Address
            URL serverURL = new URL("http://localhost:4723/");
     
            // Driver Initialization
            driver = new AndroidDriver(serverURL, options);
            wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        }
    
public void messageTest() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId(("Start chat"))));
    	driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
    	
    	// Enter the details
    	//driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ContactSearchField\"]")).sendKeys("7674922299");
    	driver.findElement(AppiumBy.accessibilityId("ContactSearchField")).sendKeys("7674922299");
    	//driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"ContactSuggestionList\"]/android.view.View")).click();
    	driver.findElement(AppiumBy.accessibilityId("//android.view.View[@resource-id=\"ContactSuggestionList\"]/android.view.View")).click();
    	//driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.messaging:id/compose_message_text\"]")).sendKeys("Hello from Appium");
    	driver.findElement(AppiumBy.accessibilityId("com.google.android.apps.messaging:id/compose_message_text\"]")).sendKeys("Hello from Appium");
    	driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
    	
    	
    	
    	 // Wait for contact to save
       // wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("Send SMS")));
 
     // Assertion
        String message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"You said  Hello from Appium 11:45 PM .\"]")).getText();
        Assert.assertEquals(message, "Hello from Appium");
    			
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}

