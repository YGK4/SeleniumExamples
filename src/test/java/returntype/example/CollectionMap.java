package returntype.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CollectionMap {
	
	public Map<String, String> getuserFormData()
	{
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("firstname", "Arjun");
		map.put("last", "abhe");
		map.put("middle", "t");
		map.put("email", "abhe@gmail.com");
		return map;

	}
	WebDriver driver;
	public void interfaceClass(int i)
	{
		if(i==1)
		driver = new ChromeDriver();
		else if(i==2)
			driver = new FirefoxDriver();
		else if(i==3)
			driver = new InternetExplorerDriver();
		else
			driver = new SafariDriver();

	}
	
	public void launch()
	{
		driver.get("http://www.google.com");
	}
	
	
	
	
	public static void main(String[] args) {
		
	CollectionMap collectionMap = new CollectionMap();
	collectionMap.interfaceClass(2);
	collectionMap.launch();
	
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "test");
		map.put("name1", "test1");
		map.put("name2", "test2");
		map.put("name3", "test3");

		
		System.out.println(map.get("name1"));
	}

}
