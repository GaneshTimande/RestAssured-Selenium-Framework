package Day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetUserTest {

    @Test
    public void getUsersList() {
        RestAssured.baseURI = "https://reqres.in";

        Response response = 
            given()
                .log().all()
            .when()
                .get("/api/users?page=2")
            .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("data.size()", greaterThan(0))
                .extract().response();

        // Extract first user's ID and Email
        int userId = response.path("data[0].id");
        String email = response.path("data[0].email");

        System.out.println("First User ID: " + userId);
        System.out.println("First User Email: " + email);
    }
}
