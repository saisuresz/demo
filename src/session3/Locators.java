package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver= new ChromeDriver();
//obj of chromedriver is created.

driver.get("https://appaccess.mphasis.com/");
//sending the url link to be called.

driver.manage().window().maximize();
//to maximize the window size

driver.findElement(By.id("textfield")).sendKeys("2368099");
//identifying the id of web element and passing the value to that web element.

driver.findElement(By.className("password")).sendKeys("sai");
driver.findElement(By.tagName("input")).sendKeys("133");
driver.findElement(By.linkText("Click Here")).click();

	driver.findElement(By.cssSelector("#submit")).click();
		driver.findElement(By.name("username")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("saisai");
Thread.sleep(2000);

driver.close();
	}

}
