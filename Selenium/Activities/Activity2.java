package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setup the firefox driver(GeckoDriver)
		WebDriverManager.firefoxdriver().setup();

		// Create a new instance of the firefox driver
				WebDriver driver = new FirefoxDriver();
			//printing the home page
				driver.get("https://v1.training-support.net/selenium/login-form");
				System.out.println("Home page title: " + driver.getTitle());
				
				
              
	}

}
