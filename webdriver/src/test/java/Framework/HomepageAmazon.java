package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageAmazon  {
	//Declare Global Variable for WebDriver
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement hover;
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement SignIn;
	
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(id="continue")
	WebElement ContinueButton;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement SignInButton;
	
	//Constructor of this class
	public HomepageAmazon(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
	}
	
	//This is creating Methods for above Elements located
	public void signinclick () {
		SignIn.click();
	}
	
	public void email() {
		Email.sendKeys("sager82@hotmail.com");
	}
	
	public void continuebutton() {
		ContinueButton.click();
	}
	
	public void password() {
		Password.sendKeys("dubai420");
	}
	
	public void signinbutton() {
		SignInButton.click();
	}
	
	public void hover () { 
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).build().perform();
		
		
	}
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	    driver.manage().window().maximize();
		
	}
}
