package sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver(); 
	 driver.navigate().to("https://sellglobal.ebay.in/seller-central/start-selling/index.html");
	Select sel = new Select(driver.findElement(By.id("business")));
	sel.selectByValue("Wholesaler/Distributor");
	driver.close();
	driver.quit();
	
}
}