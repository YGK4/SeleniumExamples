package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpodown {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement colours=chromeDriver.findElement(By.id("colors"));
		Select select = new Select(colours);
				select.selectByIndex(1);

				WebElement animals =chromeDriver.findElement(By.id("animals"));
				Select anidrop = new Select(animals);
				anidrop.selectByIndex(0);

	}

}
