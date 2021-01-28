package sel_practice;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w1 = new WebDriverWait(driver, 5);

		String itemsNeeded[] = { "Cucumber", "Cauliflower", "Mango" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoCode']")));
		driver.findElement(By.xpath("//*[@class='promoCode']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//*[@class='promoBtn']")).click();

		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));

		System.out.println(driver.findElement(By.xpath("//*[@class='promoInfo']")).getText());

		driver.close();
	}

	public static void addItems(WebDriver driver, String itemsNeeded[]) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String name[] = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List<String> reqItems = Arrays.asList(itemsNeeded);

			if (reqItems.contains(formattedName)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}
