package session7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimendDate {

	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void timedate() {
		String str1= "//table/tbody/tr[";
		String str2= "]/td[";
		String str3="]";
		
		for (int i=1;i<=36;i++)
		{
			for(int j=1;j<9;j++) {
				
				System.out.print(driver.findElement(By.xpath(str1+i+str2+j+str3)).getText()+"\t");

			}
			System.out.println();
		}
		
	}

	
}
