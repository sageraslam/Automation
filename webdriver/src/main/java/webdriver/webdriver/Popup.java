package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		driver.findElement(By.xpath("//button[@data-day='10']")).click();
		driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
		driver.findElement(By.xpath("//button[@data-day='24']")).click();
		
		
		
	}

}
