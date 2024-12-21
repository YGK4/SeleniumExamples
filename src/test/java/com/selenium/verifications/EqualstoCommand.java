package com.selenium.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualstoCommand {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://testautomationpractice.blogspot.com");
		
		WebElement element = chromeDriver.findElement(By.xpath("//h2[normalize-space()='Drag and Drop']"));
		//String actualText = element.getDomAttribute("value");
		String actualText = element.getText();

		System.out.println(actualText);
		String expectedText = "Drag and Drop";

		if (actualText.equals(expectedText)) {
		    System.out.println("Text matches");
		} else {
		    System.out.println("Text does not match");
		}
	}

}
