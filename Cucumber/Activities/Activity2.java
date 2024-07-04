package stepDefinitions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity2 {

	public class Loginsteps {
		
		WebDriver driver;
		
		@Given("User is on login page")
		public void Loginpage() {
			driver = new FirefoxDriver();
			driver.get("https://v1.training-support.net/selenium/login-form");
	}
      @When("the user enters username and password")
      public void Logindetails() {
    	  //Find username field and enter username
        	  driver.findElement(By.id("username")).sendKeys("admin");
           //Find password field and enter username
        	  driver.findElement(By.id("password")).sendKeys("password");
      }
	
      @When("the user enters {string} and {string}")
      public void Enterinputs(String username, String password ) {
    	  //Find input fields
    	  WebElement usernameField = driver.findElement(By.id("username"));
    	  WebElement passwordField = driver.findElement(By.id("password"));
    	  //clear the fields
    	  usernameField.clear();
          passwordField.clear();
          //Find username Field and enter username
          usernameField.sendKeys("username");
          passwordField.sendKeys("password");
      }
      
      @And("clicks the submit button")
      public void clickSubmit() {
    	  //Find the submit button and click it
    	  driver.findElement(By.xpath("//button[@type = 'submit']")).click();
      }
      
      @Then("get the confirmation text and verify message")
      public void confirmationmessage() {
    	  //Find the confirmation message//
    	  String message =  driver.findElement(By.id("action-confirmation")).getText();
    	  //Assert message
    	  Assertions.assertEquals("Welcome Back, admin", message);
      }
      
      
      @Then("get the confirmation text and verify message as {string}")
      public void confirmationmessageasInput(String expectedMessage) {
    	  //Find the confirmation message//
    	  String message =  driver.findElement(By.id("action-confirmation")).getText();
    	  //Assert message
    	  Assertions.assertEquals(expectedMessage, message);
      }
     
}
}