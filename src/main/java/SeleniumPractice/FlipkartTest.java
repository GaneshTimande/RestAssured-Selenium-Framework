package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlipkartTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void flipkartE2EFlow() throws InterruptedException {
        // 1. Navigate to Flipkart
        driver.get("https://www.flipkart.com");

        // 2. Close login popup if it appears
        try {
            WebElement closeBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            closeBtn.click();
        } catch (Exception e) {
            // Popup did not appear
        }

        // 3. Search for "iPhone"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iPhone");
        searchBox.submit();

        // 4. Click on first product
		/*
		 * Thread.sleep(2000); WebElement firstProduct =
		 * driver.findElements(By.cssSelector("div._4rR01T")).get(0);
		 * firstProduct.click();
		 * 
		 * // 5. Switch to new tab List<String> windows = new
		 * ArrayList<>(driver.getWindowHandles());
		 * driver.switchTo().window(windows.get(1));
		 * 
		 * // 6. Simulate 'Add to Cart' try { WebElement addToCart =
		 * driver.findElement(By.xpath("//button[text()='Add to cart']"));
		 * addToCart.click(); System.out.println("Add to cart clicked"); } catch
		 * (Exception e) {
		 * System.out.println("Add to cart button not found or login required."); }
		 * 
		 * // Add any further steps here (e.g., go to cart, logout, etc.)
		 */    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
