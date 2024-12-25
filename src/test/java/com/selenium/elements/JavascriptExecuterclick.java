package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterclick {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://testautomationpractice.blogspot.com");
		  WebElement element = chromeDriver.findElement(By.id("male"));
		  JavascriptExecutor executor = (JavascriptExecutor)chromeDriver;
		  executor.executeScript("arguments[0].click();", element);
		  
	}

}
