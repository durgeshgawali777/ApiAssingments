package assignment2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PUT {
	@Test
	public void test_1 () {
		given().
				header("Content-Type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}").
		when().
				put("https://reqres.in/api/users/2").
		
		then().
				statusCode(200).
				log().all();
		
	}
}
