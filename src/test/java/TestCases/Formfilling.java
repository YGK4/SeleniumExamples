package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Formfilling {

	ChromeDriver chromeDriver = null;

	@BeforeClass
	public void beforeClass()
	{
		chromeDriver = new ChromeDriver();
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
