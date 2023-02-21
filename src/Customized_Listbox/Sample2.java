package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		//To Enter URL /Open an Application
		  
		  driver.get("https://www.facebook.com/");
		  
		  //wait
		  Thread.sleep(2000);
		  
		  
		  // Click Create new account button
		  
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
  
          //wait
          Thread.sleep(2000);
		  
		  //Step-I-Identify element and store it into an object
		  
		      WebElement Month  =driver.findElement(By.id("month"));
		      
		   // Step-II-Create object of Actions class
		      
		        Actions act= new Actions (driver);
		        
		   //Step-III-call the method (left check)
		        
		        act.click(Month).perform();
		        
		        //wait
		        Thread.sleep(2000);
		        
		        
		        // To move on step downward
		        
		        act.sendKeys(Keys.ARROW_DOWN).perform(); // Feb
		        
		        act.sendKeys(Keys.ARROW_DOWN).perform(); // march
		         
		        act.sendKeys(Keys.ARROW_DOWN).perform(); // Apr
		        
		        act.sendKeys(Keys.ARROW_DOWN).perform(); // May
		        
		        // To move one step upward
		        
		        act.sendKeys(Keys.ARROW_UP).perform();   //Apr
		        
		        act.sendKeys(Keys.ARROW_UP).perform();   //Mar
		  
		  
	}

}
