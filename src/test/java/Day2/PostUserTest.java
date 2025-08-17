package Day2;import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostUserTest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";

        Response response = given()
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"Ganesh\", \"job\": \"QA Engineer\" }")
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)  // Check if creation is successful
                .body("name", equalTo("Ganesh"))
                .body("job", equalTo("QA Engineer"))
                .extract().response();

        String userId = response.jsonPath().getString("id");
        System.out.println("✅ User Created with ID: " + userId);
    }
}
