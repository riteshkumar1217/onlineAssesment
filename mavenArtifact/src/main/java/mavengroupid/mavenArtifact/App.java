package mavengroupid.mavenArtifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        System.out.println( "Hello World!" );
        driver.get("http://www.way2testing.com/p/blog-page.html");
        driver.close();
    }
}
