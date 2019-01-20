import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser initiated"+LocalDateTime.now());
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		WebElement link = driver.findElement(By.id("button1"));
//		To handle multiple window and closing all tab
//		for(int i=0;i<3;i++)
//		{
//			link.click();
//		}
//		Set<String> wh = driver.getWindowHandles();
//		for(String s:wh)
//		System.out.println(s);
//		Thread.sleep(5000);
//		driver.quit();
		link.click();
		Set<String> child = driver.getWindowHandles();
		for(String s:child)
		{
			if(s.equalsIgnoreCase("https://www.toolsqa.com/"));
			System.out.println("Moved to child ");
			System.out.println(driver.getCurrentUrl());
		}
		
		

	}

}
