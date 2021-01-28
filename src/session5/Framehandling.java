package session5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framehandling {

	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("http://www.angelfire.com/super/badwebs/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void frames() {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='contents']")));
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]")).click();
	}
	
}
