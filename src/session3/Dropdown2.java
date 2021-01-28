package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Select s1= new Select(driver.findElement(By.id("searchDropdownBox")));
		
		s1.selectByValue("search-alias=stripbooks");
		//s1.selectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chetan bhagat");
		driver.findElement(By.className("nav-input")).click();
		
		Thread.sleep(20000);
		driver.close();
	}

}
