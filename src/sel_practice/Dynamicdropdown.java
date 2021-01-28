package sel_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamicdropdown {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'])[1]")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		//	driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();


		//  instead of using indexes in xpath i.e,[1] we can use parent child xpath ie, first write parent xpath followed by a space
		// then our reqd xpath. this makes selnium to search in the specifc parent node only . ex:
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"));

		
		//Auto suggestive dropdown
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> countries =  driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement country:countries) {
			if(country.getText().equalsIgnoreCase("india"))
			{
				country.click();
				break;
			}
			
			//radio button for trip
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			//Handling calender and selecting required dates
			
			//driver.findElement(arg0)
			
			
			
		}
		driver.close();
	}
}