package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Textverification {

	ChromeDriver chromeDriver = new ChromeDriver();
	
	@BeforeMethod
	public void beforeMethod() {
	  chromeDriver.get("https://testautomationpractice.blogspot.com");
	}
	@AfterMethod
	public void afterMethod () {
		
		chromeDriver.quit();
	}
	@Test
	public void test () {
	WebElement element = chromeDriver.findElement(By.xpath("//h2[normalize-space()='Drag and Drop']"));
	String actualText = element.getText();

	System.out.println(actualText);
	String expectedText = "Drag and Drop";

	WebDriverWait wait = new WebDriverWait(chromeDriver , Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Drag and Drop']")));
	if (actualText.equals(expectedText)) {
	    System.out.println("Text matches");
	} else {
	    System.out.println("Text does not match");
	}	

}
}
