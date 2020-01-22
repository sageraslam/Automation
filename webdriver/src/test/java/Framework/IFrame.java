package Framework;

import org.testng.annotations.Test;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class IFrame {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("Droppable")).click();
		Actions DD = new Actions (driver);
		driver.switchTo().frame(0);
		DD.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Slider")).click();
		DD.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"slider\"]/span")), 200, 0).build().perform();
		
	  //  screenshots();
	  
  }
  @BeforeClass
  public void beforeClass() throws WebDriverException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com");
	
		driver.manage().window().maximize();
		
	  
  }

  @AfterClass
  public void afterClass() throws WebDriverException, IOException {
	  screenshots(); 
  }
public void screenshots() throws WebDriverException, IOException {
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
}
