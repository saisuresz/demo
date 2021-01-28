package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/campaign/landing.php");

		driver.manage().window().maximize();

		Select s1= new Select(driver.findElement(By.id("day")));
		s1.selectByVisibleText("4");
		
		Select s2= new Select(driver.findElement(By.id("month")));
		s2.selectByVisibleText("Jul");
		
		Select s3= new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("1998");
		
		Thread.sleep(2000);
		driver.quit();
	}
	

}
