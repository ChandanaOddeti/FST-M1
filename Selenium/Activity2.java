package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		// Open the browser
		driver.get("https://v1.training-support.net/selenium/login-form");
		// Print the title of the page
		System.out.println("Home page title: " + driver.getTitle());
		//Find the username field using any locator and enter "admin" into it.
		driver.findElement(By.id("username")).sendKeys("admin");
		//Find the password field using any locator and enter "password" into it
		driver.findElement(By.id("password")).sendKeys("password");
		//Find the "Log in" button using any locator and click it.
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		// Close the browser
        driver.quit();
	}

}
