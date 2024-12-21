package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	ChromeDriver chromeDriver = new ChromeDriver();

	@BeforeMethod
	public void beforeMethod() {
		chromeDriver.get("https://www.google.com/");
		System.out.println("before method_______");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method_______");
		chromeDriver.quit();
	}

	@Test
	public void verifyuserCreation1() {
		System.out.println("test cases_______");
		assertEquals(chromeDriver.getCurrentUrl(),"https://www.google.com/" );
	}
}