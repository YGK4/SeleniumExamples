package com.selenium.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindows {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
 		String ajaxAct= chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).getText();
            if (ajaxAct.equalsIgnoreCase("Hidden Elements & AJAX123")){
            System.out.println("true");
            	
            }
            else {
            	
            	System.out.println("false");
            }
            
		// chromeDriver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
		
		 //chromeDriver.switchTo().window();

		 
		 //chromeDriver.close();
	}

}
