package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocators {

	public static void main(String[] args) {

		
		ChromeDriver driver= new ChromeDriver();
		//obj of chromedriver is created.

		driver.get("https://appaccess.mphasis.com/");
		//sending the url link to be called.

		driver.manage().window().maximize();
		//to maximize the window size

	WebElement pwd =	driver.findElement(By.className("password"));
//driver.findElement(withTagName("input").above("pwd")).sendkeys("1234");
	}

}
