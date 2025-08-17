package Day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SampleApiTest {

    @Test
    public void getUsers() {
        given()
            .baseUri("https://reqres.in/api")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200)
            .body("page", equalTo(2))
            .body("data.size()", greaterThan(0))
            .log().all();
    }
    @Test
    public void createUserWithHashMap() {
        // Create request body using HashMap
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("name", "Ganesh");
        requestBody.put("job", "QA Engineer");

       int id = given()
            .baseUri("https://reqres.in")
            .basePath("/api/users")
            .contentType(ContentType.JSON)
            .body(requestBody) // REST-assured automatically converts it to JSON

        .when()
            .post()
            .jsonPath().getInt("id");
//
//        .then()
//            .statusCode(201)
//            .body("name", equalTo("Ganesh"))
//            .body("job", equalTo("QA Engineer"))
//            .body("id", notNullValue())
//            .body("createdAt", notNullValue());
    
}
}