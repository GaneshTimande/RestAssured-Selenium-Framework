package Playwright;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
public class LoginLogoutwithTestng {
@Test
public void LoginTest() {
		// TODO Auto-generated method stub
		Browser browser = null;
		Page page = null;
try {
		 browser =Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
		 page=browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		String title=page.title();
		//PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		Assert.assertTrue(page.title().contains("Learn Automation Courses"));
	//	page.locator("#email1").fill("admin@email.com");
		//page.locator("xpath=//input[@name='email1']").fill("admin@email.com");
		page.getByPlaceholder("Enter Email").fill("admin@email.com");
		page.getByPlaceholder("Enter Password").fill("admin@123");
		page.locator("xpath=//button[@type='submit']").click();
		page.waitForTimeout(4000);
		PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome");
		page.getByAltText("menu").click();
		page.getByText("Sign out").click();
		PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
	
	}
		finally {
			page.close();
			browser.close();
		}
		}
		

}
