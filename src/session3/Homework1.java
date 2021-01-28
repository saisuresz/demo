package session3;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
	
				ChromeDriver driver= new ChromeDriver();

				driver.get("https://www.amazon.in/");

				driver.manage().window().maximize();
				
			WebElement block=	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
															
			List<WebElement>	allLinks=	block.findElements(By.tagName("a"));

			System.out.println("no. of Links "+allLinks.size());
			for(WebElement link:allLinks)
			{
				System.out.println(link.getText());
			}
			for(int i=0;i<allLinks.size();i++) 
			{
				
				if(!allLinks.get(i).getText().isEmpty()) {
					System.out.println(allLinks.get(i).getText());
					String expUrl = allLinks.get(i).getAttribute("href");
					allLinks.get(i).click();
				    Thread.sleep(1000);
				    String actUrl = driver.getCurrentUrl();
				    System.out.println(expUrl);
				    System.out.println(actUrl);
				    
				    driver.navigate().back();
				    allLinks=	block.findElements(By.tagName("a"));

				}
			}
		
			driver.close();
			}
}
		

