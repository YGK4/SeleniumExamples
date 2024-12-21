package UltimateQA;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NamesAndDetails {
	ChromeDriver chromeDriver = null;

	@BeforeMethod
	public void namesAndDetails() {
		chromeDriver = new ChromeDriver();
        chromeDriver.get("https://ultimateqa.com/complicated-page");
		
	}
        
      @AfterMethod
      public void namesAndDetails2() {
    	  
    	  
    	  
      }
      
        @Test 
        public void enterdingAndVerifying () {
        	
        		chromeDriver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Barney");
       		 String actualeext = chromeDriver.findElement(By.id("name")).getDomProperty("value");
       		
    		String expectedText = "Barney";
           assertEquals(actualeext, expectedText);
    		if (actualeext.equals(expectedText)) {
    			System.out.println("Text matches");
    		} else {
    			System.out.println("Text does not match");
        }
        
        
}
        }
