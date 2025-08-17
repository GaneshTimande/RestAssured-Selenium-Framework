package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo {

    WebDriver driver; // Declare WebDriver

    // Constructor to initialize the elements
    public PomDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Correct method call
    }
	@FindBy(id="username")
	WebElement  email;
	
	
	   public void enterEmail(String value) {
	        email.sendKeys(value);
	    }
	}

// Touch
