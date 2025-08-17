package Day2;import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class PostUsingExternalFile {

    @Test
    public void postWithExternalFile() {
        File jsonFile = new File("src/test/resources/payload.json");

        given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .contentType(ContentType.JSON)
            .body(jsonFile)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("foo"))
            .body("body", equalTo("bar"))
            .body("userId", equalTo(1));
    }
}
