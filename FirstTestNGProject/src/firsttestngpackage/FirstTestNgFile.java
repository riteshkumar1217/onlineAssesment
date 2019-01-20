package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgFile {
	public String baseurl = "http://demo.guru99.com/test/newtours/";
	String driverpath = "D://chromedriver.exe";
	public WebDriver driver;
	
  @BeforeTest
  public void launchbrawser()
  {
	  System.out.println("launching Chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverpath );
	  driver=new ChromeDriver();
	  driver.get(baseurl);
  }
  @Test
  public void verifyHomepageTitle() {
	  
	  
	  String expectedTitle = "Welcome: Mercury Tours";
	  Assert.assertEquals(expectedTitle, driver.getTitle());
  }
  @AfterTest
  public void closebrowser()
  {
	  
	  driver.close();

  }
//  @Test(priority=0)
//  public void c_test()
//  {
//	  Reporter.log("C Test executedd");
//  }
//  @Test(priority=1)
//  public void b_test()
//  {
//	  Reporter.log("A Test executedd");
//  }
//  @Test(priority=2)
//  public void aa_test()
//  {
//	  Assert.assertTrue(true);
//  }
}
