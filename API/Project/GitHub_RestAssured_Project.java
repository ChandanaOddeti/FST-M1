package Project;
import io.restassured.builder.RequestSpecBuilder ;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import java.util.*;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class GitHub_RestAssured_Project {
		RequestSpecification requestSpec;
		ResponseSpecification responseSpec;
		int SSHId;
		String SSHKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIENZqeIAJwDI67SLaSv4POst9ovSxVAF87gR2HEsIGyj";
		
		@BeforeClass
		public void setup() {
			//Request Specification
			requestSpec = new RequestSpecBuilder().
					setBaseUri("https://api.github.com").
					addHeader("Content-Type", "application/json").
					addHeader("Authorization", "token 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").
					build();
			//Response Specification
			responseSpec = new ResponseSpecBuilder().
					expectResponseTime(lessThanOrEqualTo(4000L)).
					build();
		}
		//POST Request method
		@Test(priority = 1)
		public void PostRequestTest() {
			//Request Body
			Map<String,String> reqBody = new HashMap<>();
	    	reqBody.put("title", "TestAPIKey");
	    	reqBody.put("key" ,SSHKey);
	    	
	    	//Send Request and save response
	    	Response response = given().spec(requestSpec).body(reqBody).when().post("/user/keys");
	    	response.prettyPrint();
	    	
	    	//Extract the key
	    	SSHKey = response.then().extract().path("key");
	    	SSHId = response.then().extract().path("id");
	    	
	       //Assertions
	    	response.then().spec(responseSpec).body("key",equalTo (SSHKey));
		}
		
		 //GET Request
	    @Test(priority = 2)
	    public void getRequest() {
	    	
	   	Response response = given().spec(requestSpec).pathParam("keyId",SSHId).
	    	when ().get("/user/keys/{keyId}");
	   	int responseCode = response.getStatusCode();
	   	Assert.assertEquals(responseCode,200);
	   	 
	    }
	    
	    //Delete Request
	    @Test(priority = 3)
	    public void deleteRequest() {
	    	Response response = given().spec(requestSpec).pathParam("keyId",SSHId).
	    	when ().delete("/user/keys/{keyId}");
	    	int responseCode = response.getStatusCode();
		   	Assert.assertEquals(responseCode,204);
	    	
	    	
	    }
		
	}
		

