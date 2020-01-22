package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FacebookHomePage {
	WebDriver driver;
	@Test
  public void f() {

		FaceBookLogIn home = new FaceBookLogIn(driver);
		home.Email();
		home.Password();
		home.Login();
		
		
  }
  @Parameters({"envir2","browser"})	
  @BeforeClass
  public void beforeClass(String envir2, String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(envir2);
		    driver.manage().window().maximize();
	  }else if (browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sager\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get(envir2);
		  driver.manage().window().maximize();
	  }else {
		  System.out.println("Correct your Browser settings Please");
	  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
	  
  }

}
