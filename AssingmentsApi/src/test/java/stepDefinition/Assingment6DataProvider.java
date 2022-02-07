package stepDefinition;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assingment6DataProvider {
	RequestSpecification request;
	Response response;

	@DataProvider (name="User") 
		public String [][] createUser(){
			return new String[][] {
				{"Durgesh","Test Engineer"},
				{"ABC", "Teacher"},
				{"xyz", "Accountant"},

			};
		}



		@Test(dataProvider="User")
		@Given("Providing data using data provider")
		public void providing_data_using_data_provider(String name, String profile) {
			// Write code here that turns the phrase above into concrete actions
			//    throw new io.cucumber.java.PendingException();
			RestAssured.baseURI="https://reqres.in";
			request = given().header("content-type","application/json").body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}\r\n"
					+ "");
		}

		@When("Posted With correct informantion for data provider")
		public void posted_with_correct_informantion_for_data_provider(String name, String profile) {
			// Write code here that turns the phrase above into concrete actions
//			throw new io.cucumber.java.PendingException();
			String path = "api/users";
			response = request.get(path).then().log().all().extract().response();
		}

		@Then("validating the response code for data provider")
		public void validating_the_response_code_for_data_provider() {
			// Write code here that turns the phrase above into concrete actions
//			throw new io.cucumber.java.PendingException();
			System.out.println(response.getStatusCode());
		}


	}
