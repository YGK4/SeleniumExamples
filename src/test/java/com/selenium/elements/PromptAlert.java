package com.selenium.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeDriver = new ChromeDriver();
		  chromeDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		  chromeDriver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		//  WebDriverWait driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
		  //driverWait.until(ExpectedConditions.alertIsPresent());
          Thread.sleep(5000);
          chromeDriver.switchTo().frame(0);
          
          chromeDriver.switchTo().defaultContent();
          

           Alert promptAlert = chromeDriver.switchTo().alert();
        //   promptAlert.sendKeys("testing");
   //       System.out.println(promptAlert.getText());
          promptAlert.sendKeys("gfdgfdg");
          promptAlert.accept();
          System.out.println("completedcvcxv");
		  
		//  JavascriptExecutor executor = (JavascriptExecutor)chromeDriver;
		  //executor.executeScript("arguments[0].click();", element);
	}

}
