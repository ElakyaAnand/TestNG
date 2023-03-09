package practisingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(ImplementsListerns.class)
public class ParallelExecution {


	@Test
	
	public void orangehrm() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		WebElement username=ob.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement password=ob.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");

		WebElement loginbutton=ob.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
	}


	/*
	 * @Test public void google()
	 * 
	 * { System.setProperty("webdriver.chrome.driver",
	 * "D:\\Selenium\\chromedriver\\chromedriver.exe"); WebDriver ob=new
	 * ChromeDriver(); ob.get("https://www.google.co.in");
	 * 
	 * }
	 */
}
