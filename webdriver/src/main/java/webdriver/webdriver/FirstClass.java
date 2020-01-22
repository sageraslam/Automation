package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		//Thread.sleep(4000);
		
		// How to refresh the browser
		//driver.navigate().refresh();
		
		//How to go back page
	//	driver.navigate().back();
		
		// How to move page forward
		//driver.navigate().forward();
		
		// How to Max the page
		driver.manage().window().maximize();
		
		// How to get the current URL
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pakistani clothes");
		//driver.findElement(By.linkText("Best Sellers")).click();
	//	driver.findElement(By.linkText("Best Sellers")).click();
		
		
		//How to close the Browser
		//driver.close();
		
		
		
	}
	

}
