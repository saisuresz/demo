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

public class CheckboxesHw {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms09.htm");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void checkboxes() {
		
		
		List<WebElement> checkboxess=	driver.findElements(By.xpath("//td[@class='table5']/descendant::input"));
		
		for(WebElement checkbox:checkboxess)
		{
			System.out.println(checkbox.getAttribute("value")+"-----"+checkbox.getAttribute("checked"));
		}
		
	}

}






