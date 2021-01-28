package session4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test(priority=2)
	public void register() {
		System.out.println("registered succesfully");
	}
	@Test(priority=3)
	public void login() {
		System.out.println("login sucess");

	}
@BeforeTest
public void start()
	{
		System.out.println("start");

	}
	@AfterTest
	public void end() {
		System.out.println("end");

	}
	@BeforeMethod
	public void initi() {
		System.out.println("A");

	}
	
	@AfterMethod
	public void fina() {
		System.out.println("Z");

	}
	
}
