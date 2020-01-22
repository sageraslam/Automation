package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("headerMyAccountTitle")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sager82@hotmail.com");
		driver.findElement(By.id("password-input-field")).sendKeys("Broker786!");
		driver.findElement(By.id("zipCode")).sendKeys("22193");
		driver.findElement(By.id("phone")).sendKeys("7034083900");
		driver.findElement(By.className("bttn__content")).click();
		
	}

}
