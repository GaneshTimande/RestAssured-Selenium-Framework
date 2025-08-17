package SeleniumPractice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBrowserNotificaiton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(options);
	driver.get(" https://www.google.com");
	Dimension size= driver.manage().window().getSize();
	System.out.println(" width" + size.getWidth());
	System.out.println(" height" + size.getHeight());
	
	}

}
