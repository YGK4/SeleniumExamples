package com.selenium.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsnadPopups {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		 chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();

		// chromeDriver.findElement(By.id("alertBtn")).click();
		// Alert alert = chromeDriver.switchTo().alert();
		// alert.accept();
		// chromeDriver.findElement(By.id("confirmBtn")).click();
		// Alert alert2 = chromeDriver.switchTo().alert();
		// alert2.dismiss();
		 chromeDriver.findElement(By.id("promptBtn")).click();
		 Alert alert3 = chromeDriver.switchTo().alert();
		 
		 alert3.sendKeys("It is ok");
//		 alert3.accept();
	}

}
