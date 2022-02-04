package stepDefinition;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import junit.framework.Assert;

public class Assingment4NegativeScenario {
	 RequestSpecification request;
	 Response response;
	@Given("testing -ve scenario")
	public void testing_ve_scenario() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";
		request = given().header("content-type","application/json");
		
	}
	
		
		
	

	@When("Posted With correct informantion")
	public void posted_with_correct_informantion() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path = "api/unknown/23";
		response = request.get(path).then().log().all().extract().response();
	}

	@Then("validating the response code for negative scenario")
	public void validating_the_response_code_for_negative_scenario() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		int StatusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());
		Assert.assertEquals(404, response.getStatusCode());
	}


}
