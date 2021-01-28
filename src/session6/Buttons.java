package session6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Buttons {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void button() {
		
		List<WebElement>buttons=	driver.findElements(By.xpath("//input[@name='group1']"));
		for(WebElement button:buttons)
		{	
			button.click();
			buttons=	driver.findElements(By.xpath("//input[@name='group1']"));

			for(WebElement btn:buttons)
			{		
				System.out.println(btn.getAttribute("value")+"------"+btn.getAttribute("checked"));
			}
			
		}
		
		
		
	}

}






