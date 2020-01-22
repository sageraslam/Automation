package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BOA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys("js@");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sbjgkjkj");
		driver.findElement(By.xpath("//button[@id='signIn']")).click();
		
		
	}

}
