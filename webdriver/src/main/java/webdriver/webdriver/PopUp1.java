package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cookie_action_close_header")).click();
	//	driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	//	driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Yes");
	//	driver.switchTo().alert().accept();
	}

}
