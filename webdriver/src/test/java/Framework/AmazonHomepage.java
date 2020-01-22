package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AmazonHomepage {
  WebDriver driver;
	@Test
  public void f() {
		HomepageAmazon home = new HomepageAmazon(driver);
		home.hover();
		home.signinclick();
		home.email();
		home.continuebutton();
		home.password();
		home.signinbutton();
  }
  @Parameters({"envir","browser"})
  @BeforeClass
  public void beforeClass(String envir, String browser) {
	  
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(envir);
		    driver.manage().window().maximize();
	  }else if (browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sager\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get(envir);
		  driver.manage().window().maximize();
	  }else {
		  System.out.println("Correct your Browser settings Please");
	  }
	//  HomepageAmazon home = new HomepageAmazon(driver);
	  //home.browser();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
