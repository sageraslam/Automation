package webdriver.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sager\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		Actions hover = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		hover.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(6000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(1000);
	
		hover.dragAndDropBy(driver.findElement(By.xpath("//span[@tabindex='0']")), 200, 0).build().perform();
	  
		

		// Code to move the slider in middle
	//	hover.dragAndDropBy(driver.findElement(By.xpath("//span[@tabindex='0']")), 200, 0).build().perform();
	

		
		
		
	}

}
