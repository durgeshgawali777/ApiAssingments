package assignment2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class POST {
	@Test
	public static void test1() {
		
//	Response res1= given().log().all()
//			.header("Content-Type","application/json")
//			.body("{\r\n"
//					+ "    \"name\": \"ABC\",\r\n"
//					+ "    \"job\": \"leader\"\r\n"
//					+ "}")
//			.when().post("https://reqres.in/api/users")
//			.then().log().all().statusCode(201).extract().response();
		
		given().
				header("Content-Type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}").
		when().
				post("https://reqres.in/api/users").
				
		then().
				statusCode(201).
				log().all();
		}
}