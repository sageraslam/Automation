package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogIn {
	//Declare Global Variable
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Login;
	
	//Constructor of this class
	public FaceBookLogIn (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}

	//This is creating Methods for above Elements located
	public void Email() {
		Email.sendKeys("sager82@hotmail.com");
	}
	
	public void Password() {
		Password.sendKeys("Dubai420");
	}
	
	public void Login() {
		Login.click();
	}
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	}
}
