package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Hardassert {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SoftAssert soft=new SoftAssert();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		System.out.println("Scroll Success");

		driver.findElement(By.linkText("Open a popup window")).click();
		String parentwindow= driver.getWindowHandle();
		Set <String>childwind=driver.getWindowHandles();
		Iterator<String>itr=childwind.iterator();
		while(itr.hasNext()) {
			String s= itr.next();
			if(!s.equals(parentwindow)) {
				driver.switchTo().window(s);
				Thread.sleep(3000);
				driver.close();
				driver.switchTo().window(parentwindow);
				Thread.sleep(3000);
				driver.close();
			}
		}


		//driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(34000);

		driver.navigate().to(driver.getCurrentUrl());

		//// driver.navigate().refresh();
		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.F5).build().perform();

		// JavascriptExecutor  exe =(JavascriptExecutor)driver;
		// exe.executeScript("window.location.reload();");
		System.out.println(" thththhtht");
		// driver.manage().deleteAllCookies();
		// Set<Cookie> s1 = driver.manage().getCookies();
		// for(Cookie name: s1) {
		// System.out.println(name);
		// }
		// System.out.println(" the dleted all cookie");
		// driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		// driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.ENTER);
		// synchronized(driver)
		// {
		//	 driver.wait(5000);
		// }
		// 
		// JavascriptExecutor jse=(JavascriptExecutor)driver;
		// driver.get("https://tutorialsninja.com/demo/");
		// WebElement search=driver.findElement(By.name("search"));
		// jse.executeScript("arguments[0].value='mac'", search);
		// Thread.sleep(8000);
		// search.clear();
		// 
		//
		//
		// driver.get("https://omayo.blogspot.com");
		//  WebElement s = driver.findElement(By.id("textbox1"));
		// String ss=s.getAttribute("value");
		// System.out.println(ss);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//  driver.findElement(By.className("dropbtn")).click();
		//  driver.findElement(By.linkText("Facebook")).click();
		//  		System.out.println(" test");
		// driver.close();
		//driver.findElement(By.xpath("//h2[normalize-space(text())='Hidden Button']")).click();
		//System.out.println(driver.getTitle().equals("Account Login"));
		//driver.switchTo().alert();
		//driver.switchTo().frame("y");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
		// //driver.switchTo().window("ddd");
		// 
		//System.out.println(driver.findElement(By.xpath("//input[@value='Login']")).isEnabled());
		//System.out.println(driver.findElement(By.xpath("//input[@value='Login']")).isSelected());

	}

}

