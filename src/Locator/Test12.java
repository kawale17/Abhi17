package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
	
	
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  
		  driver.get("file:///G:/ABHIJIT/Vcity/Viraj%20Sir/name1.html");

             
             
             //wait
             Thread.sleep(2000);
             
             
             //Enter UN

            driver.findElement(By.name("1234")).sendKeys("Kausalya1234");
             
             
             //wait
            Thread.sleep(2000);
            
            //Enter PSW
            
      driver.findElement(By.name("5678")).sendKeys("Swanu");


             
          
       

	}


}
