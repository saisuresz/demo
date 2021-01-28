package sel_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {
	
	@Test
	public void scrnshot() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jenkins.io/download/");
		
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
	
	FileUtils.copyFile(src, new File("F:\\installers\\my_workspace\\SeleniumAutomation\\screenshots\\screenshot1.png"));
	
	}
}
