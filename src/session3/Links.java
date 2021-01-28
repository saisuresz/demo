package session3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();

driver.get("https://appaccess.mphasis.com/");

driver.manage().window().maximize();

List<WebElement> allLinks=driver.findElements(By.tagName("a"));

for(WebElement link:allLinks)
{
	System.out.println(link.getText());
}
driver.quit();
	}

}
