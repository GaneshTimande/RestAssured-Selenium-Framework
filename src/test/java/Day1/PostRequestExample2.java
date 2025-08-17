package Day1;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class PostRequestExample2 {
	   public static void main(String[] args) {
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

	        Response response = given()
	                .contentType(ContentType.JSON)
	                .body(requestBody)
	                .when()
	                .post("/posts")
	                .then()
	                .statusCode(201)
	                .extract()
	                .response();

	        System.out.println("Response: " + response.asString());
	    }
	}