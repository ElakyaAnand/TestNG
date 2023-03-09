package practisingtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteTest {
	WebDriver ob;
	long starttime;
	long endtime;
	long total;
	
	@BeforeSuite
	public void beforesuite()
	{
		starttime= System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		 ob=new ChromeDriver();
		
	}
	
	@Test
	public void google()
	{
		
		ob.get("https://www.google.co.in");
		
	}
	
	@Test
	public void yahoo()
	{
		ob.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		ob.close();
		endtime= System.currentTimeMillis();
		total=endtime-starttime;
		System.out.println("The Total time taken is "+ total);
		
		
		
	}

}
