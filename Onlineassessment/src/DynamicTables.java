import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
//		https://www.techbeamers.com/handling-html-tables-selenium-webdriver/
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/htmltable.html");
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rsize=row.size();
		for(int i=0;i<rsize;i++)
		{
			List<WebElement> cell = row.get(i).findElements(By.tagName("td"));
			int csize=cell.size();
			for(int j=0;j<csize;j++)
			{
				String v=cell.get(j).getText();
				
				System.out.println(v);	
			}
		}
	}

}
