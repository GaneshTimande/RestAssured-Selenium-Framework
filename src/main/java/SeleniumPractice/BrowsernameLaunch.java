package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowsernameLaunch {
	  static WebDriver driver;
	  
	public static void browerLaunch(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			ChromeOptions options= new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			Alert alert=driver.switchTo().alert();
			
			alert.accept();
			alert.dismiss();
			alert.getText();
			String s = driver.findElement(By.xpath("test")).getAttribute("value");
					
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			
		
	}
		else if (BrowserName.equalsIgnoreCase("Safari")) {
				driver=new SafariDriver();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    browerLaunch("chrome");
	}

}

/*
 * // Expection: Recovrable iisue ioexceptopn fild not found threadintercented,
 * sql , outof memobru salti arthmetic expection
 */