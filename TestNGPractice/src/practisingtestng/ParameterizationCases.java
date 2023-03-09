package practisingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationCases {
	
	@Test
	@Parameters({"uname","pword"})
	public void orangehrm(String UN, String PW) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement username=ob.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(UN);
		
		WebElement password=ob.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(PW);
		
		WebElement loginbutton=ob.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
	}

}
