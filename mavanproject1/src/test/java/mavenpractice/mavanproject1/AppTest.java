package mavenpractice.mavanproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class mavendemo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Firefox browser initilize");
		driver.get("http://www.way2testing.com/p/blog-page.html");
		System.out.println("Web page open");
		driver.close();
	}
}