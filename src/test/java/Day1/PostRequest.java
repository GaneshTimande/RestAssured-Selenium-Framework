package Day1;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.HashMap;

import org.testng.annotations.Test;

public class PostRequest {
	int id;
	@Test
	public void post() {
		
		 String requestBody = "{\r\n"
		 		+ "    \"name\": \"morpheus\",\r\n"
		 		+ "    \"job\": \"leader\"\r\n"
		 		+ "}";
		
	id=	given()
		.contentType("application/json")
		.body(requestBody)
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	
	
	}

}
