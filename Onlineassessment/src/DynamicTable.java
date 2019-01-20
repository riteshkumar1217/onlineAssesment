import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DynamicTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//		  WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		  driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		  String string = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		  System.out.println(string);
		  driver.findElement(By.partialLinkText("details")).click();
		  System.out.println("Link fetched");
		  
		  String astring="Clock Tower Hotel";
		  List<WebElement> tables = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
		  int size=tables.size();
		  System.out.println(size);
		  for(int i=1;i<size;i++)
		  {
//			  String str =driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td["+ i +")").getText();
			  String str=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ i +"]")).getText();
			  System.out.println(str);
		  }
		  

	}

}
