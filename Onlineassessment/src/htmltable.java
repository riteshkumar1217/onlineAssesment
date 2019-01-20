import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/htmltable.html");
		List<WebElement> rlist = driver.findElements(By.tagName("tr"));
		int rsize= rlist.size();
		for(int i=0;i<rsize;i++)
		{
			List<WebElement> rcollist = rlist.get(i).findElements(By.tagName("td"));
			int colsize = rcollist.size();
			for(int j=0;j<colsize;j++)
			{
				String v=rcollist.get(j).getText();
				System.out.println();
			}
		}
	}

}
