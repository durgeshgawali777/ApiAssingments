package stepDefinition;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assingment5NegativeScenarioUsingAssertions {
	RequestSpecification request;
	 Response response;
	@Given("testing -ve scenario for assertions")
	public void testing_ve_scenario_for_assertions() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json");
	}

	@When("Posted With incorrect information")
	public void posted_with_incorrect_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String path = "api/unknown/23";
		response = request.get(path).then().log().all().extract().response();
	}

	@Then("validating the response code for negative scenario for assertions")
	public void validating_the_response_code_for_negative_scenario_for_assertions() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		int Code = response.getStatusCode();
		String line = response.getStatusLine();
		System.out.println(response.getStatusCode());
		Assert.assertEquals(404, response.getStatusCode());
		Assert.assertEquals("HTTP/1.1 404 Not Found", response.getStatusLine());
	}

}
