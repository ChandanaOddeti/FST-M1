package Project;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class projectActivity9 {
	// Declare the WebDriver object
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    
    @Test
    public void Test1() {
    	 // Navigation bar
    	driver.navigate().to("https://alchemy.hguy.co/lms/");
        //Select the menu All Courses
    	webElement menu = driver.findElement(By.<a[@href='https://alchemy.hguy.co/lms/all-courses/'>All Courses</a>
}
}