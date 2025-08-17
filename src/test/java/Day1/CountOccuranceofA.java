package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOccuranceofA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Launch the website
        driver.get("https://testautomationpractice.blogspot.com/");
        
      int row=  driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
      int colum=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
      
      
      for(int r=2;r<=row;r++) {
    	  for( int c=1;c<=colum;c++) {
    		String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    		System.out.println(value+"\t");
    	  }
      }

        // Optional: wait for few seconds
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
