package SeleniumPractice;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless"); // Uncomment if headless mode is needed

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		System.out.println("Page Title: " + driver.getTitle());

		// Wait might be needed here due to dynamic loading, consider WebDriverWait if needed

		try {
			WebElement emailInput = driver.findElement(
					with(By.xpath("//span[normalize-space()='Login']"))
					.above(By.xpath("//span[contains(text(),'Furniture')]"))
					);


			System.out.println("Found element text: " + emailInput.getText());
			Actions action=  new Actions(driver);
			action.moveToElement(emailInput).click().build().perform();
			System.out.println(" Login click");
		} catch (Exception e) {
			System.out.println("Element not found: " + e.getMessage());
		}
	}
}