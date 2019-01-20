import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;  

public class GuruTutorials1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser initiated"+LocalDateTime.now());
		driver.get("http://www.demo.guru99.com/V4/");
		System.out.println("URL Entered");
		driver.findElement(By.cssSelector("input[name=uid]")).sendKeys("mngr173899");
		System.out.println("URL Entered");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("AtApetu");
		System.out.println("PasswordEntered");
		driver.findElement(By.cssSelector("input[name=btnLogin]")).submit();
		System.out.println("Sumit button clicked");
		String actualuid =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		String euid="mngr173899";
		if(actualuid.contains(euid))
		{
			System.out.println("User verified");
		}
		else
		{
			System.out.println("Invalid user");
		}
		driver.close();
				}

}
