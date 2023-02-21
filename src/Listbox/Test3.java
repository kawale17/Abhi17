package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	
	//Approach-II	
	public static void main(String[] args) throws InterruptedException 
		
		
		{
			//Step-I
			//Parameter-I-Name of the Browser
			//Parameter-II-path of ChromeDriver.exe.file
			
			
			
              System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			
			
          //Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
			
             WebDriver driver = new ChromeDriver ();
			
           // To enter URL // open an applications
			  
           driver.get("https://www.facebook.com/");

      
	       //wait
	     Thread.sleep(2000);
	             
	     //Click create new account button
	     
	      driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	             
	      
	    //wait
		  Thread.sleep(2000);
		  
	             
	     //Step-I-Identify listbox and store it into an object
		     
	       WebElement Month =driver.findElement(By.xpath("//select[@id='month']"));
	       
	       
	    //Step-II-Create object of Select class
	       
	       Select S1 = new Select (Month);
	       
	     //Step-III-Call the methods
	       
	       S1.selectByIndex(3);
	       
		}
}
