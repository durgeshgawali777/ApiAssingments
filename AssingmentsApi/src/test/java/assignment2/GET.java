package assignment2;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GET {
	@Test
	public void test_01() {
		given().
				header("Content-Type", "application/JSON").
		when().
				get("https://reqres.in/api/users?page=2").
		then().
				statusCode(200).
				log().all();
	}

}
