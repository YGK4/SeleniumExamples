package com.selenium.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomProperty {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://testautomationpractice.blogspot.com");
		  
		  WebElement element = chromeDriver.findElement(By.id("start-date"));
			//String actualText = element.getDomProperty("outerHTML");
			String actualText = element.getText();

			System.out.println(actualText);
			String expectedText = "dd/mm/yyyy";

			if (actualText.equals(expectedText)) {
			    System.out.println("Text matches");
			} else {
			    System.out.println("Text does not match");
	}
	
	}
}

