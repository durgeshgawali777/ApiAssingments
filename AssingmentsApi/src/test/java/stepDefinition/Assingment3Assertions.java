package stepDefinition;

import static io.restassured.RestAssured.given;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assingment3Assertions {
	RequestSpecification request;
	 Response response;
	 

	@Given("API for testing Post Method")
	public void api_for_testing_post_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("When");
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
	}

	@When("Posted with correct information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path = "api/users";
		response = request.post(path).then().log().all().extract().response();
//		Response res = get("https://reqres.in/api/users?page=2"); 
	}

	@Then("Validate positive response code for post method")
	public void validate_positive_response_code_for_post_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		System.out.println("Response Status Code "+response.getStatusCode());
		System.out.println("Response Status line "+response.getStatusLine());
		System.out.println("Content Type "+response.getContentType());
		
		Assert.assertEquals(201, response.getStatusCode());
		Assert.assertEquals("HTTP/1.1 201 Created", response.getStatusLine());
		Assert.assertEquals("application/json; charset=utf-8", response.getContentType() );
		
	}
}
