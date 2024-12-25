package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Formfilling2 {

	WebDriver chromeDriver = null;

	@BeforeClass
	public void beforeClass()
	{
		int i=1;
		//chromeDriver = new ChromeDriver();
		if(i==1)
			chromeDriver = new ChromeDriver();
			else if(i==2)
				chromeDriver = new FirefoxDriver();
			else if(i==3)
				chromeDriver = new InternetExplorerDriver();
			else
				chromeDriver = new SafariDriver();
		chromeDriver.get("https://testautomationpractice.blogspot.com");
		
		
	}
	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void aftermethod() {

	//	chromeDriver.quit();

	}

	@Test
	public void verifyingName() {

		chromeDriver.findElement(By.id("name")).sendKeys("fdsfvfgfgfgdg");
		chromeDriver.findElement(By.id("phone")).sendKeys("9999999999");
		chromeDriver.findElement(By.id("email")).sendKeys("arj@gmail.com");
		chromeDriver.findElement(By.id("textarea")).sendKeys("fdsfvfgfgfgdg");
		// chromeDriver.findElement(By.id("submit")).click();

	}

	@Test
	public void verifyingNameisentered() {

		 String acT = chromeDriver.findElement(By.id("name")).getDomProperty("value");
		// String actualText = element.getDomAttribute("value");
		//String acT = element.getText();

		//System.out.println(acT);
		String expectedText = "Gopal";
assertEquals(acT, expectedText);
		if (acT.equals(expectedText)) {
			System.out.println("Text matches");
		} else {
			System.out.println("Text does not match");
		}
	}
	
	@Test
	public void verifyingCheckboxTicked() {
		chromeDriver.findElement(By.id("sunday")).click();

	WebElement checkbox=	chromeDriver.findElement(By.id("sunday"));
	
	//Assert.assertTrue(checkbox.isSelected()); 
	Assert.assertTrue(checkbox.isSelected());
	//if (checkbox.isSelected()) {
	 //   System.out.println("Checkbox is selected");
	//} else {
	  //  System.out.println("Checkbox is not selected");
	//}
	
	}
	@Test
	public void verifyingCheckboxnotTicked () {
		WebElement checkbox=	chromeDriver.findElement(By.id("monday"));
	//	Assert.assertFalse(checkbox.isSelected()); 
		Assert.assertFalse(checkbox.isSelected());;
		
       
		//if (checkbox.isSelected()) {
		 //   System.out.println("Checkbox is selected");
		//} else {
		 //   System.out.println("Checkbox is not selected"); 
	//}
	
}
}
