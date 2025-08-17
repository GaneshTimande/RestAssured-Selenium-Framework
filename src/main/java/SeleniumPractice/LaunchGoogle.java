package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGoogle {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

//        // Navigate to Google
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
//
//        // Optional: Maximize the browser window
//        driver.manage().window().maximize();
//        driver.findElement(By.linkText("(user and pass: admin)")).click();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // Optional: Print page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser after 5 seconds
        try {
            Thread.sleep(5000); // wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit(); // Close the browser
    }
}
