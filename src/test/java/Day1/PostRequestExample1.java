package Day1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class PostRequestExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String requestbody= "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

		Response response=given()
				.contentType(ContentType.JSON)
				.body(requestbody)
				.when()
				.post("/posts")
				.then()
				.statusCode(201)
				.extract()
				.response();
		System.out.println(" Respnse: "+ response.asString());


	}

}
