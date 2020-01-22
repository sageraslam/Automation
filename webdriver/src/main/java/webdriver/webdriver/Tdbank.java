package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tdbank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tdbank.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='td-button td-button-secondary td-button-large td-copy-nowrap loginout']")).click();
		driver.findElement(By.xpath("//input[@name='psudoUsername']")).sendKeys("sager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dubai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
		//driver.navigate().refresh();
		//driver.navigate().back();
	//	driver.close();
	}

}
