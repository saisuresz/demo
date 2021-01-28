package session5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandlingHW {

	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void alerts() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr285913");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AqagYpy");

		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();;
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("85913");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(3000);

		
		Alert alert	=	driver.switchTo().alert();//creating alert obj and assigning to alert class
		System.out.println(alert.getText());
		alert.accept();
		Alert alert2	=	(Alert) driver.switchTo().alert();//creating alert obj and assigning to alert class
		System.out.println(alert2.getText());
		
		alert.accept();
			
		
	}
	
}
