package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://the-internet.herokuapp.com/nested_frames");
		  chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-top")));

		  chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-left")));
		 System.out.println(chromeDriver.findElement(By.xpath("//*[contains(text(),'LEFT')]")).getText());
		  chromeDriver.switchTo().defaultContent();
		  chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-top")));

		  chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-middle")));
			 System.out.println(chromeDriver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]")).getText());
			  chromeDriver.switchTo().defaultContent();
          
			// chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-top")));
			  chromeDriver.switchTo().frame(chromeDriver.findElement(By.name("frame-bottom")));
				 System.out.println(chromeDriver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]")).getText());

          //chromeDriver.switchTo().defaultContent();
		  

	         
		  
	}

}
