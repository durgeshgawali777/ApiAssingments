package assignment3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Assertion {
	
	public void test_1() {
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		
		

}
	@Test
void test1() {
		
	Response res= given().log().all()
			.queryParam("page", "2")
			.header("Content-Type","application/json")
			.when().get("https://reqres.in/api/users?page=2")
			.then().log().all().statusCode(200).extract().response();
//		    Assert.assertEquals(statusCode,201);
}

}
