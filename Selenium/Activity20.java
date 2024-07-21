package Activities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new firefoxdriver();
		WebDriverwait wait = new WebDriver wait(driver,Duration.ofSeconds(10));
		//Open the page
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        //Get Title
		System.out.println("Home Page Title is :"+ driver.getTitle());
		//Find and click button to open the alert
		}

}
