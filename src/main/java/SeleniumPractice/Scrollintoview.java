package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Scrollintoview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftAssert soft=new SoftAssert();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		WebElement dropdown=driver.findElement(By.xpath("//button[normalize-space()='Dropdown']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",dropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1200));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(1233));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
	}

}
