package stepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assingment2PostMethod {
	RequestSpecification request;
	 Response response;
	
	@Given("API for testing post method")
	public void api_for_testing_post_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}\r\n"
				+ "");
	
	}

	@When("posted with correct information for post method")
	public void posted_with_correct_information_for_post_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String path = "api/users";
		response = request.get(path).then().log().all().extract().response();
	}

	@Then("validate positive response code received for post method")
	public void validate_positive_response_code_received_for_post_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println(response.getStatusCode());
	}

}
