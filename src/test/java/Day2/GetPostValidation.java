package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GetPostValidation {

	@Test
	public void validateGetPostByID() {
		given()
		.baseUri("https://jsonplaceholder.typicode.com")
		.when()
		.get("/posts/1")
		.then()
		.statusCode(200)
		.body("id",equalTo(1))
		.body("userId", notNullValue())
		.body("title", not(emptyOrNullString()))
		.body("body",not(emptyOrNullString()));
	}

}
