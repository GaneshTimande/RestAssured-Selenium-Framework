package Day1;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class PostRequestExample {
	 int id;
	@Test(priority=1)
	public void post() {
		  
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

	        id = given()
	                .contentType(ContentType.JSON)
	                .body(requestBody)
	                .when()
	                .post("/posts")
	               .jsonPath().getInt("id");
	        
	       // System.out.println("Response: " + response.asString());
	    }
	@Test(priority=2, dependsOnMethods= {"post"})
	public void post1() {
		  
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        String requestBody = "{ \"title\": \"fook\", \"body\": \"bar\", \"userId\": 1 }";

	        given()
	                .contentType(ContentType.JSON)
	                .body(requestBody)
	                .when()
	                .put("/posts"+id)
	                .then()
	                .statusCode(201);
	        
	             
	        
	       // System.out.println("Response: " + response.asString());
	    }
	
	
	}