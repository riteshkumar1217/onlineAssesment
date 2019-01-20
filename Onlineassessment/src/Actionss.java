import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		WebElement e = driver.findElement(By.xpath("//*[@id='g-mainbar']/div[1]/div/div/div/div/div/div[2]/p[19]/a/img"));
		Actions action=new Actions(driver);
		action.moveToElement(e).click().build().perform();
		
	}

}
