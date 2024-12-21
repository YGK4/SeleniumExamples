package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();

	}

}
