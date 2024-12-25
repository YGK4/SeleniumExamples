package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterText {

		public static void main(String[] args) {
			ChromeDriver chromeDriver = new ChromeDriver();
			  chromeDriver.get("https://testautomationpractice.blogspot.com");
		
		String string = "fsdffd";
		
		WebElement element = chromeDriver.findElement(By.id("name"));
		 JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
		 jse.executeScript("arguments[0].value='"+string+"';", element);
		
		
		
	}

}
