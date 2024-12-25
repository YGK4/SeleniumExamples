package UltimateQA;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class SearchElement {

	@Test
	public void searchElementse()  {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");

		chromeDriver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Earth");
		chromeDriver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(chromeDriver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='wikipedia-search-result-link']/a")));

		List<WebElement> searchNames = chromeDriver
				.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

		System.out.println(searchNames.size());
		String targetText = "Eartha Kitt";

		boolean isTextPresent = false;

		for (WebElement searchelement : searchNames) {
			if (searchelement.getText().equalsIgnoreCase(targetText)) {
				System.out.println(searchelement.getText());
				 isTextPresent = true;
				 break;
			} else
				System.out.println(searchelement.getText());
		}

	
	 assertTrue(isTextPresent);
	// assertEquals(targetText, isTextPresent);
	// System.out.println("Is text present? " + isTextPresent);
	}
}