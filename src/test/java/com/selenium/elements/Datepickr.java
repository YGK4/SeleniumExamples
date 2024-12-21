package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickr {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		//chromeDriver.findElement(By.id("post-body-1307673142697428135")).click();

		chromeDriver.findElement(By.id("txtDate")).click();
		chromeDriver.findElement(By.xpath("//a[@data-date='17']")).click();

		chromeDriver.findElement(By.id("datepicker")).sendKeys("10/04/2024");
		
		chromeDriver.findElement(By.id("start-date")).sendKeys("10/04/2024");
		chromeDriver.findElement(By.id("end-date")).sendKeys("10/12/2024");
		chromeDriver.findElement(By.xpath("//button[@class='submit-btn']")).click();



	}

}
