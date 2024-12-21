package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	@Test
	public void f() {

		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://demoqa.com/text-box");
		// chromeDriver.manage().window().maximize();
		// JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
		// js.executeScript("arguments[0].click();",
		// chromeDriver.findElement(By.name("btnI")));

		WebElement element = chromeDriver.findElement(By.id("userName"));
		element.sendKeys("fdsfvfgfgfgdg");
		
		chromeDriver.findElement(By.id("userName")).sendKeys("fdsfvfgfgfgdg");
		
		chromeDriver.findElement(By.id("currentAddress")).sendKeys("fdsfvfgfgfgdg");
		chromeDriver.findElement(By.id("userEmail")).sendKeys("arj@gmail.com");
		chromeDriver.findElement(By.id("permanentAddress")).sendKeys("fdsfvfgfgfgdg");
		chromeDriver.findElement(By.id("submit")).click();

		chromeDriver.quit();

		// chromeDriver.findElement(By.name("btnI")).click();

		// new
		// WebDriverWait(chromeDriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.name("btnI"))).click();

	}
}
