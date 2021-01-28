package sel_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Test;

public class JavaAlert {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("sai");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		driver.quit();
		System.out.println("step by local machine");
		System.out.println("done by sai hp");
	}
	
	@Test
	public void newtest() {
		System.out.println("new test 1");
	}
	@Test
	public void newtest2() {
		System.out.println("new test 2");
	}
	@Test
	public void newtest3() {
		System.out.println("new test 2");
	}
}