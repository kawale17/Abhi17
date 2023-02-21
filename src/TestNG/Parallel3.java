package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 

{    
       @Test         // Test Case / Method
	
	public void OpenKiteZerodha() throws InterruptedException
	
	{
         System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  
		  driver.get("https://www.policybazaar.com/");

		//wait
          Thread.sleep(2000);      
   

	}
	
	

}
