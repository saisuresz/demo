package session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesHW1 {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");

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
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='overview-frame.html']")));

		List<WebElement>allLinks	=	driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
}
}
