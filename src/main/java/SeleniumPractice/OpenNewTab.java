package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.service.DriverService;

public class OpenNewTab {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver.switchTo().newWindow(WindowType.TAB);
		
	}

}
