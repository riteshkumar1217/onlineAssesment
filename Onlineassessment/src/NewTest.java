//import org.testng.Reporter;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TestNgDemo {
//	@BeforeMethod
//	public void preCondition()
//	{
//		Reporter.log("Login",true);
//		
//	}
//	@AfterMethod
//	public void postCondition()
//	{
//		Reporter.log("Logout",true);
//		
//	}	
//	@Test
//	public void testA()
//	{
//		Reporter.log("Create",true);
//		
//	}
//	@Test(invocationCount=5)
//	public void testB()
//	{
//		Reporter.log("delete",true);
//		
//	}
//
//}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class NewTest {
  @Test
  @Parameters("Browser")
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("FF")){
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  Reporter.log("Firefox Launched");
		  driver.close();
	  }
	  else if(browser.equalsIgnoreCase("CC"))
		  System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		Reporter.log("Firefox Launched");
  }
}

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
// 
//public class TestCase1 {
// 
//@Test
// 
//// Here this parameters we will take from testng.xml
//@Parameters("Browser")
//public  void test1(String browser) {
// 
//if(browser.equalsIgnoreCase("FF")){
// 
//WebDriver driver=new FirefoxDriver();
// 
//driver.manage().window().maximize();
// 
//driver.get("http://www.facebook.com");
// 
//driver.quit();
// 
//}
//else if(browser.equalsIgnoreCase("IE")){
// 
//System.setProperty("webdriver.ie.driver", "./server/IEDriverServer.exe");
// 
//WebDriver driver=new InternetExplorerDriver();
// 
//driver.manage().window().maximize();
// 
//driver.get("http://www.facebook.com");
// 
//driver.quit();
//}
//}
// 
//}
