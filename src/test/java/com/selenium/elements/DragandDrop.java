package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		
		chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
		 Actions actions = new Actions(chromeDriver);
		 WebElement dragElement = chromeDriver.findElement(By.id("draggable"));
		 WebElement dropElement = chromeDriver.findElement(By.id("droppable"));
		 actions.clickAndHold(dragElement).moveToElement(dropElement).release().perform();

	}

}
