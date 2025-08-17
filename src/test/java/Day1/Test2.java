package Day1;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class Test2 {

	@Test
	 void testposse()
{
		 HashMap< String, String> data =new HashMap();
		 data.put("name", " test");
		 
		 data.put("name", " test");
		 data.put("job", " test");
		 data.put("name", " test");
		

		 given()
		// .contentType("application/Json")
		// .body(data)
		 .when().get("https://reqres.in/api/users?page=2")
		 .then().
		 statusCode(200);
}
}
