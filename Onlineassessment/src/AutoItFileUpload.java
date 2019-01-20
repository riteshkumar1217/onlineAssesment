import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class AutoItFileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		  driver.findElement(By.name("upfile")).click();
		  Runtime.getRuntime().exec("D:/upload1.exe");
		  driver.close();
		  

	}

}
