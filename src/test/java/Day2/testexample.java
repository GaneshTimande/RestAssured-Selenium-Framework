package Day2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class testexample {
	@Test
	public void GetCookiesInfo (){
		
		Response res=given()
		.when()
		.get("https://www.google.com/");
	String cookie=	
		res.getCookie("AEC");
	System.out.println(" The cookies  vale" + cookie);

	}
		

	}


