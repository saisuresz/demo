package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver= new ChromeDriver();
//obj of chromedriver is created.

driver.get("https://appaccess.mphasis.com/");
//sending the url link to be called.

driver.manage().window().maximize();
//to maximize the window size

driver.findElement(By.id("textfield")).sendKeys("2368099");
//identifying the id of web element and passing the value to that web element.

driver.findElement(By.id("password")).sendKeys("8686707915sai!");

driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//based on xpath clicking a web element

driver.findElement(By.xpath("/html/body/div/a[1]")).click();

Thread.sleep(2000);

driver.close();
	}

}
