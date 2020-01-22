package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotSignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("headerMyAccountTitle")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("SPSOSignIn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("sager82@hotmail.com");
		driver.findElement(By.id("password-input-field")).sendKeys("Broker786!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
