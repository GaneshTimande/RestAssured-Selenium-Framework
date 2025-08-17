package Playwright;
import com.microsoft.playwright.*;
public class PlaywrightExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://google.com");
            System.out.println(page.title());
            browser.close();
        }
    }
}
	
