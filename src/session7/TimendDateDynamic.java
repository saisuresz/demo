package session7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimendDateDynamic {

	
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
	WebElement web=	driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']"));
	List<WebElement> rows=	web.findElements(By.tagName("tr"));
	for(WebElement row :rows)
	{
		List<WebElement> cols = row.findElements(By.tagName("td"));
		for(WebElement col:cols) {
			System.out.print(col.getText()+"\t");
		}
		System.out.println();
	}
		
	}

	
}
