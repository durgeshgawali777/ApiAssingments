package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Assingment1 {
	RequestSpecification request;
	 Response response;
	@Given("API for testing get method")
	public void api_for_testing_get_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		given().contentType(ContentType.JSON);
		String baseURI="https://reqres.in";
		request = given().header("content-type","application/json");
		System.out.println("When");
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json").log().all();
		
		
		
	}

	@When("posted with correct information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String path = "/api/users?page=2";
		response = request.get(path).then().log().all().extract().response();
	}

	@Then("validate positive response code received for get method")
	public void validate_positive_response_code_received_for_get_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		response = get("https://reqres.in//api/users?page=2");
		System.out.println(response.getStatusCode());	}

}
