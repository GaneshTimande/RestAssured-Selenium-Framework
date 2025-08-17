package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostUsingJSONObject {

    @Test
    public void postWithJSONObject() {
        // Create JSON payload using JSONObject
        JSONObject request = new JSONObject();
        request.put("title", "foo");
        request.put("body", "bar");
        request.put("userId", 1);

        given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .contentType(ContentType.JSON)
            .body(request.toString()) // Convert JSONObject to string
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("foo"))
            .body("body", equalTo("bar"))
            .body("userId", equalTo(1));
    }
}