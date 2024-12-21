package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
		 Actions actions = new Actions(chromeDriver);
		 WebElement element = chromeDriver.findElement(By.className("dropbtn"));
		 actions.moveToElement(element).perform();
		 WebElement hoverOption = chromeDriver.findElement(By.xpath("//hover/option/xpath"));
		 hoverOption.click();
	}

}
