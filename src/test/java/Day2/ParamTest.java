package Day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ParamTest {
	
	
	@DataProvider(name="userIds")
	
	public Object[][] getids(){
		return new Object[][] {{101},{102},{103}};
	}

@Test(dataProvider="userIds")
public void userTest(int userid) {
	
	given()
	.pathParam("id", userid)
	.when()
	.get("https://ap.exmaple.com/users/{id}")
	.then()
	.statusCode(200);
}
}
