package sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdowns {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(staticdropdown);
		sel.selectByValue("INR");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
