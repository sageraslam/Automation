package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.id("email")).sendKeys("sager82@hotmail.com");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sager420@hotmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sager123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click();
//		driver.findElement(By.id("pass")).sendKeys("Sahiladil#1412!");
	//	driver.findElement(By.id("u_0_2")).click();
		
	}

}
