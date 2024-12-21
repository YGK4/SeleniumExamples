package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox2 {
	
	public Checkbox2(WebElement animals) {
		// TODO Auto-generated constructor stub
	}
	public Checkbox2() {
		// TODO Auto-generated constructor stub
	}
	public void launchBrwser()
	{

	}
	public void click (ChromeDriver chromeDriver,String id) {
		
		chromeDriver.findElement(By.id(id)).click(); // check box
		
	}
	public void type (ChromeDriver chromeDriver,String text,String id) {
		
		chromeDriver.findElement(By.id(id)).sendKeys(text);
	}
	public static void main(String [] args) {

		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		//Checkbox2 checkbox2 = new Checkbox2();
		
		//checkbox2.type(chromeDriver, "name", "ram");
		
		chromeDriver.findElement(By.id("name")).sendKeys("ram");
		
		chromeDriver.findElement(By.id("sunday")).click(); // check box
		chromeDriver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		chromeDriver.findElement(By.id("phone")).sendKeys("9999999999");
		chromeDriver.findElement(By.id("textarea")).sendKeys("ramjhbihfbvievojenlcenoj");
		chromeDriver.findElement(By.id("male")).click();
		chromeDriver.findElement(By.id("country")).sendKeys("Canada");

	
	
	WebElement colours=chromeDriver.findElement(By.id("colors"));
	Select select = new Select(colours);
			select.selectByIndex(1);

			WebElement animals =chromeDriver.findElement(By.id("animals"));
			Select anidrop = new Select(colours);
			anidrop.selectByIndex(1);
			
            
             
	}
	
	}	

