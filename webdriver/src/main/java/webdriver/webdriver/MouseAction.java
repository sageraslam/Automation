package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	//	hover.moveToElement(driver.findElement(By.linkText("Create a List"))).click().build().perform();
	//	hover.moveToElement(driver.findElement(By.linkText("Your Orders"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[4]/span")).click();
	}

}
