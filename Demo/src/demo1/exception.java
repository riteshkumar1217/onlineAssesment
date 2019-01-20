package demo1;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exception {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://beginnersbook.com/");
		WebElement e = driver.findElement(By.partialLinkText("Java "));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		Actions action =new Actions(driver);
		action.contextClick(e).build().perform();
//		WebElement elementOpen = driver.findElement(By.linkText("Open"));
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		Thread.sleep(5000);
		driver.close();
		
	}

}
