package ABC_Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
//		driver.findElement(By.xpath("")).click();
	
		//label[@for='fromCity']
		
	
	
	}

}
