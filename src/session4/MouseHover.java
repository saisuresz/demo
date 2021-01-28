package session4;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	public void mousehover() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, 300);");
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"toggleBtn1\"]/a"))).perform();
//		driver.findElement(By.id("topNav-PersistentDebt")).click();
//
		}
}