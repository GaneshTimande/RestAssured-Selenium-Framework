package Day1;import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class JsonPlaceholderSchemaValidation {

    @Test
    public void validatePostSchema() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
            .when()
            .get("/posts/1")
            .then()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("post_schema.json"));
    }
}
