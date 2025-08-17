package Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class RegisterNewUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = null;
		Page page = null;
		 browser =Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
		 page=browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		String title=page.title();
		page.getByText("New user? Signup").click();
		PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isDisabled();
		page.locator("#name").fill("ganesh");
		page.getByPlaceholder("Email").fill("ganesh27@gmail.com");
		page.getByPlaceholder("Password").fill("admin");
		page.locator("xpath=//label[text()='Playwright']//preceding::input[1]").click();
		page.locator("xpath=//input[@value='Female']").click();
		PlaywrightAssertions.assertThat(page.locator("xpath=//input[@value='Female']")).isChecked();
		page.locator("#state").selectOption("Goa");
		String[] hobbies= {"Playing", "Swimming"};
		page.locator("#hobbies").selectOption(hobbies);
		PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isEnabled();
		
	}

}
