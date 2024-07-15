import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Project_activity5 {
	// Driver Declaration
    AndroidDriver driver;

 // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
    	 UiAutomator2Options options = new UiAutomator2Options();
         options.setPlatformName("android");
         options.setAutomationName("UiAutomator2");
         options.setAppPackage("com.android.chrome");
         options.setAppActivity("com.google.android.apps.chrome.Main");
         options.noReset();

         // Server Address
            URL serverURL = new URL("http://localhost:4723/");
     
            // Driver Initialization
            driver = new AndroidDriver(serverURL, options);
        }
     
    // Test method
    @Test
    public void loginCheck() {
        
        driver.findElement(AppiumBy.id("Firefox")).click();
        driver.findElement(AppiumBy.id("com.android.chrome:id/url_bar")).sendKeys("https://v1.training-support.net/selenium/lazy-loading");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Login\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("admin");
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"loginOverlay\"]/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("password");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log In\"]")).click();
    
    }
 
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app)
        driver.quit();
    }
}