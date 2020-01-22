package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("Jameson");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("Kilber");
		driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).sendKeys("dtc7860@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("dtc7860@yahoo.com");
		driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("dubai420!");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("8");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1975");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).click();
		
		
	}

}
