import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
	// Driver Declaration
    AndroidDriver driver;

 // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
    	 UiAutomator2Options options = new UiAutomator2Options();
         options.setPlatformName("android");
         options.setAutomationName("UiAutomator2");
         options.setAppPackage("com.google.android.calculator");
         options.setAppActivity("com.android.calculator2.Calculator");
         options.noReset();

         // Server Address
            URL serverURL = new URL("http://localhost:4723/");
     
            // Driver Initialization
            driver = new AndroidDriver(serverURL, options);
        }
     
        // Test method
        @Test
        public void addTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("digit_5")).click();
            driver.findElement(AppiumBy.accessibilityId("plus")).click();
            driver.findElement(AppiumBy.id("digit_9")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();
     
            // Find the result
            String result = driver.findElement(AppiumBy.id("result_final")).getText();
            
     
            // Assertion
            Assert.assertEquals(result, "14");
        }
     
     @Test 
     public void subtractTest() {
    	 driver.findElement(AppiumBy.id("digit_1")).click();
         driver.findElement(AppiumBy.id("digit_0")).click();
         driver.findElement(AppiumBy.accessibilityId("minus")).click();
         driver.findElement(AppiumBy.id("digit_5")).click();
         driver.findElement(AppiumBy.accessibilityId("equals")).click();
         
         // Find the result
         String result = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();

         // Assertion
         Assert.assertEquals(result, "5");
     }
     
   @Test
   public void multiplyTest() {
	   driver.findElement(AppiumBy.id("digit_5")).click();
       driver.findElement(AppiumBy.accessibilityId("multiply")).click();
       driver.findElement(AppiumBy.id("digit_1")).click();
       driver.findElement(AppiumBy.id("digit_0")).click();
       driver.findElement(AppiumBy.id("digit_0")).click();
       driver.findElement(AppiumBy.accessibilityId("equals")).click();

       // Find the result
       String result = driver.findElement(AppiumBy.id("result_final")).getText();

       // Assertion
       Assert.assertEquals(result, "500");
   }
   
    	 
     @Test
     
     public void divideTest() {
  	   driver.findElement(AppiumBy.id("digit_5")).click();
  	   driver.findElement(AppiumBy.id("digit_0")).click();
       driver.findElement(AppiumBy.accessibilityId("divide")).click();
       driver.findElement(AppiumBy.id("digit_2")).click();
       driver.findElement(AppiumBy.accessibilityId("equals")).click();

         // Find the result
         String result = driver.findElement(AppiumBy.id("result_final")).getText();

         // Assertion
         Assert.assertEquals(result, "25");
     }

        // Tear down method
        @AfterClass
        public void tearDown() {
            // Close the app
            driver.quit();
        }
    }

