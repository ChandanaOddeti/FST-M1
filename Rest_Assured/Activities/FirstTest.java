package examples;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {
	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	@Test
	public void getRequestwithQueryParam() {
		// send the request and save the response
		Response response = given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type", "application/json").queryParam("status", "alive").

				when().get("/findByStatus");

		// Print the response headers
		System.out.println(response.getHeaders());
		// Print the response body
		System.out.println(response.getBody().asString());
		System.out.println("------------------------------");
		System.out.println(response.getBody().asPrettyString());

		// Extract responses from response
		String petStatus = response.then().extract().path("[0].status");
		System.out.println("Pet Status is: " + petStatus);
		// TestNG Assertions
		Assert.assertEquals(petStatus, "alive");

		// Rest Assures Assertions
		response.then().statusCode(200).body("[0].status", equalTo("alive"));
	}
	
	
	//GET https://petstore.swagger.io/v2/pet/{petId}
	@Test
	public void getRequestwithPathParam() {

		// Send Request, Get Response and Assert with logging
		given().baseUri("https://petstore.swagger.io/v2/pet").header("Content-Type", "application/json")
				.pathParam("petId", 77232).
				log().all().
				when().get("/{petId}").
				then().statusCode(200)
				.body("status", equalTo("alive")).body("name", equalTo("Riley")).
				log().all();
	}
}