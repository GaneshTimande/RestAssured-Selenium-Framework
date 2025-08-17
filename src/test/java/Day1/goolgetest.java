package Day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class goolgetest {

	@Test
	void tesheder()
	{
		given()
		.when()
		.get("https://www.google.com/")
		.then()
		.log().body();
		
		
			
			
		
}

}
