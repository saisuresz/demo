package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chetan bhagath");
		driver.findElement(By.className("nav-input")).click();
		
		Thread.sleep(20000);
		driver.close();
	}

}
