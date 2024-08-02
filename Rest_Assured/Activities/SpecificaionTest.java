package examples;
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

import org.testng.annotations.BeforeClass;

  
    public class SpecificaionTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
    @BeforeClass
	public void setup() {
		//Request Specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com").
				addHeader("Content-Type", "application/json").
				build();
		//Response Specification
		responseSpec = new ResponseSpecBuilder().
				expectStatusCode(200).
				expectResponseTime(lessThanOrEqualTo(3000L)).
				build();
				
	}
	
    // POST "https://petstore.swagger.io/v2/pet"
    @Test(priority = 1)
    public void postRequest() {
    	//Create Request Body
    	Map<String,Object> reqBody = new HashMap<String, Object>();
    	reqBody.put("id", 77834);
    	reqBody.put("name", "Zofer");
    	reqBody.put("status", "alive");
    	
    	//Send Request and save response
    	Response response = given().spec(requestSpec).body(reqBody).when().post();
    	
    	//Extract the Pet id
    	petId = response.then().extract().path("id");
    	
       //Assertions
    	response.then().spec(responseSpec).body("status",equalTo ("alive"));
    	   }
    
    //GET https://petstore.swagger.io/v2/pet/{petId}
    @Test(priority = 2)
    public void getRequest() {
    	
    //Send request, get Response and Assert Response
    	given().spec(requestSpec).pathParam("petId",petId).
    	when ().get("/{petId}").
    	then().spec(responseSpec).body("status",equalTo("alive"));
    }
    
    //DELETE https://petstore.swagger.io/v2/pet/{petId}
    @Test (priority = 3)    
    public void deleteRequest() {
    	 //Send request, get Response and Assert Response
    	given().spec(requestSpec).pathParam("petId",petId).
    	when ().delete("/{petId}").
    	then().spec(responseSpec).body("message",equalTo(""+petId)).log().all();
    	
       	
    }
    	
    }
    
