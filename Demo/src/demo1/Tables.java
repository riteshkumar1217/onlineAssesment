package demo1;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import File;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		TakesScreenshot  src= (TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//method
		FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

		List table1 = driver.findElements(By.tagName("table"));
		System.out.println(table1.size());
		List table = driver.findElements(By.tagName("tr"));
		for(int i=0; i<table1.size(); i++)
		{
		WebElement table2 = (WebElement) table.get(i);
		String table3 = table2.getText();
		System.out.println(table3);
		}
	}
}
