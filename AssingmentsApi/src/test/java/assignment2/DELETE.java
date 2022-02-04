package assignment2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DELETE {
	@Test
	public void test_01() {
		given().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}
}
