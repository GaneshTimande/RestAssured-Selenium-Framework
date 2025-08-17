package Day1;



import static io.restassured.RestAssured.*; // for given(), when(), etc.
import static org.hamcrest.Matchers.*;       // optional for matchers

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredPostRequest {

    public void testq() {
        RestAssured.baseURI = "https://reqres.in/api";

        Response response = given()
            .header("Content-Type", "application/json")
            .body("{\"name\":\"John\", \"job\":\"QA Engineer\"}")
            .when()
            .post("/users")
            .then()
            .statusCode(201)
            .extract()
            .response();

        System.out.println("Response: " + response.asString());
    }

    public static void main(String[] args) {
        new RestAssuredPostRequest().testq();
    }
}
