package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Setup the Firefox driver(GeckoDriver)
		WebDriverManager.firefoxdriver().setup();

// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

// Open the browser
		driver.get("https://v1.training-support.net");

		// Find the About Us link and click it
		driver.findElement(By.id("about-link")).click();

		// Print the page title of the About Us Page
		System.out.println("About page title: " + driver.getTitle());

		// Print the title of the page
		System.out.println("Home page title: " + driver.getTitle());
		
		
	}
}
