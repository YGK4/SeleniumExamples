package com.selenium.elements;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\GOPAL\\OneDrive\\Desktop\\DEFINE_1.md");
		 chromeDriver.findElement(By.id("multipleFilesInput")).sendKeys();
		 chromeDriver.findElement(By.id("multipleFilesInput")).sendKeys();


	}

}
