package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample extends BaseClass {
	@BeforeAll
	public static void setUp() {
		WebDriverManager.firefoxdriver().setup();
		//Initialize firefox driver
		driver =  new FirefoxDriver();
		
	}
	@After
	public static void teardown() {
		//close the browser
		driver.quit();
	}
    @Given("the user is on the TS homepage")
    public void openTShomepage() {
    	//Open the Training SUpport Home page
    	driver.get("https://v1.training-support.net");
    	//Assertion
    	Assertions.assertEquals("Training Support",driver.getTitle());
    }
    
    @When("the user clicks on the About Us link")
    public void clickAboutLink() {
    	//Find and click About Us Link
    	driver.findElement(By.id("about-link")).click();
    	 	
    }
    @Then("the user is redirected to the About Page")
    public void verifyAboutPage() {
    	//Assertion
    	Assertions.assertEquals("About Training Support", driver.getTitle());
    	
    }
}
