package UltimateQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableNames {

	@Test
	public void tableNames() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> tableNames = chromeDriver.findElements(By.xpath("//tr/td"));

		
		for (int i = 0; i < 24; i++) {
			System.out.println(tableNames.get(i).getText());
		}
		
//		for (Iterator iterator = tableNames.iterator(); 
//		iterator.hasNext();) 
//     {
//	WebElement webElement = (WebElement) iterator.next();
//		System.out.println(webElement.getText());
//	}
	
}
}
