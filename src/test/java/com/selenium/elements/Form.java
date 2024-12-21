package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.id("input1")).sendKeys("Gopal");
		 chromeDriver.findElement(By.id("input2")).sendKeys("Krishna");
		 chromeDriver.findElement(By.id("input3")).sendKeys("Yetukuri");
		 
		 chromeDriver.findElement(By.id("btn1")).click();
		 chromeDriver.findElement(By.id("btn2")).click();
		 chromeDriver.findElement(By.id("btn3")).click();


	}

}
