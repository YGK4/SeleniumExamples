package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  ChromeDriver chromeDriver = new ChromeDriver();
	  chromeDriver.get("http://www.google.com");
	  chromeDriver.manage().window().maximize();	
	  JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
      js.executeScript("arguments[0].click();", chromeDriver.findElement(By.name("btnI")));


	// chromeDriver.findElement(By.name("q")).sendKeys("fdsfvfgfgfgdg");
	 //chromeDriver.findElement(By.name("btnI")).click();
	  
	//  new WebDriverWait(chromeDriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.name("btnI"))).click();


	  
	 
  }
}