package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Hedlessbrowser {

	public static void main(String[] args) {
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
	            emailInput.click();
	        } catch (Exception e) {
	            System.out.println("Element not found: " + e.getMessage());
	        }

	        driver.quit();
	    }
	}