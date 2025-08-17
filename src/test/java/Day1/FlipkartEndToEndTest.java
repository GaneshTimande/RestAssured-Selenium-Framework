package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlipkartEndToEndTest {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize window and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            // 1. Open Flipkart
            driver.get("https://www.flipkart.com");

            // 2. Close login popup if appears
            try {
                WebElement closeLoginPopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
                closeLoginPopup.click();
            } catch (Exception e) {
                System.out.println("Login popup not present");
            }

            // 3. Search for product
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Samsung Galaxy S24");
            searchBox.submit();

            // 4. Select the first product
            Thread.sleep(3000);  // better to use explicit wait
            List<WebElement> products = driver.findElements(By.cssSelector("a._1fQZEK"));
            if (!products.isEmpty()) {
                products.get(0).click();
            }

            // 5. Switch to new tab
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

            // 6. Click on Add to Cart
            Thread.sleep(3000);
            WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCartButton.click();

            // 7. Wait and verify item in cart
            Thread.sleep(3000);
            WebElement cartCount = driver.findElement(By.cssSelector("._253qQJ span"));
            System.out.println("Items in cart: " + cartCount.getText());

            // 8. Go to cart
            driver.get("https://www.flipkart.com/viewcart");

            // 9. Logout (if logged in - optional)
            // Flipkart does not allow automation of login/logout due to security

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 10. Close browser
            driver.quit();
        }
    }
}
