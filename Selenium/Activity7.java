package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Activity7 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		// Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);
        
        // Open the page
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
       // Find the football
        WebElement football = driver.findElement(By.id("draggable"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(football, dropzone2).build().perform();
     // Close the browser
        driver.close();
		}

}