package UltimateQA;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Elements {
	
	@Test
	public void getMobilesNames()
	{
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.flipkart.com");
		chromeDriver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		chromeDriver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		List<WebElement> mobilename = chromeDriver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		System.out.println(mobilename.size());
		for (Iterator iterator = mobilename.iterator(); 
				iterator.hasNext();) 
		{
			WebElement webElement = (WebElement) iterator.next();
			if(webElement.getText().contains("SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)"))
			{
				System.out.println(true);
			}
			else
System.out.println(false);
		}
		

		
		

		
	}

}
