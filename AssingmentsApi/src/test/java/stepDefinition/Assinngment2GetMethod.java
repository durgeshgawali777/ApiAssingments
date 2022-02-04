package stepDefinition;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assinngment2GetMethod {
	RequestSpecification request;
	 Response response;
	 
	@Given("testing the get method api for assingment2")
	public void testing_the_get_method_api_for_assingment2() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();RestAssured.baseURI="https://reqres.in";
		System.out.println("When");
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json").log().all();
	}

	@When("Posted with correct information for get method for assingment2")
	public void posted_with_correct_information_for_get_method_for_assingment2() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String path = "/api/unknown/2";
		response = request.get(path).then().log().all().extract().response();
	}

	@Then("Validating positive response code for get method for assingment2")
	public void validating_positive_response_code_for_get_method_for_assingment2() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();/
		response = get("https://reqres.in/api/users/unknown/2");;
		System.out.println(response.getStatusCode());
	}
}
