package BasicTesting;

import org.junit.Assert;
import org.junit.Test;

import bsh.org.objectweb.asm.Constants;
import io.opentelemetry.api.trace.StatusCode;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class Rest_Assured_demo {
 
 @Test
public void GetBooksDetails() { 
	// Specify the base URL to the RESTful web service 
	RestAssured.baseURI = "https://reqres.in/api/users?page=2"; 
	 Response response = RestAssured.given().header("content-Type", "application/json")
			 .when().get("https://reqres.in/api/users?page=2").then().log().all().extract().response();
	 int statuscode = response.getStatusCode();
	 //Assert.assertEquals(statuscode, Constants.HTTP, StatusCode_ok);
	 
}
}
