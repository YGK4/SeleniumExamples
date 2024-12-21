package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerlinks {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
		 chromeDriver.findElement(By.id("toggleInput")).click();
		 chromeDriver.findElement(By.id("input2")).sendKeys("hdfbeofvb");
		 chromeDriver.findElement(By.id("toggleCheckbox")).click();
		 chromeDriver.findElement(By.id("checkbox2")).click();
		 //chromeDriver.findElement(By.className("wikipedia-search-wiki-link")).click();
		 chromeDriver.findElement(By.className("start")).click();

	}

}
