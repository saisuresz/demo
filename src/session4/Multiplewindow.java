package session4;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiplewindow {

		WebDriver driver;
		@BeforeMethod
		public void setup()
		{
			 driver= new ChromeDriver();
			
			driver.get("https://www.stepchange.org/");

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		}
		
		@AfterMethod
		public void teardown() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
		
		@Test
		public void multiplewindowsTest() {
			
		String homeid =	driver.getWindowHandle();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//img[@alt='Facebook icon']")));

		
		
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try {
				driver.findElement(By.xpath("//input[@id='u_0_3']")).click();
				Thread.sleep(2000);
				driver.switchTo().window(homeid);
				break;
				
			}
			
			catch(Exception e) {
				
			}
		}
	}

}
