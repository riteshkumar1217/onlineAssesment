import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		String s="facebook";
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			String l = links.get(i).getAttribute("href");
//			System.out.println(l);
			if(l!=null && l.contains(s))
			{
				count ++;
			System.out.println("Fetched");
			}

			
		}
		System.out.println(count);
		driver.close();
	}

}
