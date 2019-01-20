import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.image.com/");
		Thread.sleep(2000);
		//driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
//		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
//		String a = driver.getWindowHandle();
//		System.out.println(a);
//		WebElement e = driver.findElement(By.id("slidetag"));
//		Scroll to 1000 pixel
//		js.executeScript("window.scrollBy(0,1000)");
//		scroll to webelement
//		js.executeScript("arguments[0].scrollIntoView();",e);
//		driver.close();
//		driver.get("http://www.tinyupload.com/");
//		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
//		Thread.sleep(5000);
//		Runtime.getRuntime().exec("C:\\Users\\training.HIREPRO\\Desktop\\upload.exe");
	}

}
