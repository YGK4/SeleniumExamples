package com.selenium.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuiElements {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://testautomationpractice.blogspot.com");
		  
		 boolean txtbox= chromeDriver.findElement(By.id("name")).isDisplayed();
		 System.out.println(txtbox);	
		 
	boolean emaibox	=chromeDriver.findElement(By.id("email")).isDisplayed();
	System.out.println(emaibox);
		//chromeDriver.findElement(By.id("phone")).getText();		
			// chromeDriver.findElement(By.id("permanentAddress")).sendKeys("fdsfvfgfgfgdg");
			
	boolean mle= chromeDriver.findElement(By.id("male")).isSelected();
           System.out.println(mle);
           boolean day = chromeDriver.findElement(By.id("sunday")).isSelected();
           System.out.println(day);
           
	}

	
	}


