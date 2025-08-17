package Day2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertTestCase {

    static WebDriver driver;

    public static void browserLaunch(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            driver = new ChromeDriver(options);
            
            driver.manage().window().maximize();
            driver.get("https://yourwebsite.com"); // replace with your URL

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='alertButton']"))); // replace with your xpath

            // Trigger the alert
            driver.findElement(By.xpath("//button[@id='alertButton']")).click(); // replace with your element

            Alert alert = driver.switchTo().alert();
            
            // Validate alert text
            String alertText = alert.getText();
            Assert.assertEquals(alertText, "Do you want to continue");

            // Accept or dismiss alert
            alert.accept(); // or alert.dismiss();

            // Validate input field value
            String value = driver.findElement(By.xpath("//input[@id='test']")).getAttribute("value"); // replace with actual xpath
            System.out.println("Input value: " + value);

            // Check if file exists
            File f = new File("C:/download/abc.pdf"); // corrected path
            Assert.assertTrue(f.exists(), "File does not exist!");

            driver.quit();
        }
    }

    public static void main(String[] args) {
        browserLaunch("chrome");
    }
}
