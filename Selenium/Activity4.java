package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://v1.training-support.net/selenium/target-practice");
		// Print the title of the page
		System.out.println("Home page title: " + driver.getTitle());
		//3rd header on the page and print it's text to the console
		String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println(thirdHeaderText);
		// Find the 5th header and print its color
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);
		// Find the violet button and print its classes
        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        // Find the grey button and print its text
        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);

        // Close the browser
        driver.close();
		} 
}

