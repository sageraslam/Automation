package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	 WebDriver driver;
  @Test
  public void f() {

	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pakistani clothes");
	 driver.findElement(By.xpath("(//input[@type='submit'])[@value='Go']")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() throws WebDriverException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		timestamp();
		driver.manage().window().maximize();
		timestamp();
  }

  @AfterClass
  public void afterClass() throws WebDriverException, IOException {
	  
  }
  public void timestamp() throws WebDriverException, IOException {
Date date = new Date();
	  
	  long time = date.getTime();
	  System.out.println("Time in Milliseconds: " + time);
	  
	  Timestamp tsdesktop = new Timestamp(time);
	  System.out.println("Current Time Stamp: " + tsdesktop);
	  
	  //How to take screenshogt
	  TakesScreenshot screenShot = (TakesScreenshot) driver;
	//  FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\sager\\OneDrive\\Documents\\Screenshots\\Screenshots.png"));
	  FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\sager\\OneDrive\\Documents\\Screenshots\\"+time+"Screenshots.png"));
	
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
