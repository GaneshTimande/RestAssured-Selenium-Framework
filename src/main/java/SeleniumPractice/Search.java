package SeleniumPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
   
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.name("q")).sendKeys("iPod");
       driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
       List<WebElement> prices = driver.findElements(By.className("Nx9bqj"));
       List<Integer> sortedPrices = prices.stream()
           .map(p -> Integer.parseInt(p.getText().replace("₹", "").replace(",", "")))
           .sorted()
           .collect(Collectors.toList());
       System.out.println(sortedPrices);
}
}