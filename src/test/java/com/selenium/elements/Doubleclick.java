package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
public static void main(String[] args) {
	ChromeDriver chromeDriver = new ChromeDriver();
	chromeDriver.get("https://testautomationpractice.blogspot.com/");
	 chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
	 Actions actions = new Actions(chromeDriver);
	 WebElement button = chromeDriver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	 actions.doubleClick(button).perform();
}
}
