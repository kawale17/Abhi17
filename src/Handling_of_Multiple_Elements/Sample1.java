package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	
	
public static void main(String[] args) throws InterruptedException


  // Handling of Multiple Elements
	
	
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
		  
		  // To identify links
		  
		  
		     List<WebElement> Alllinks=driver.findElements(By.xpath("//a"));
		     
		     
		     for(WebElement S1:Alllinks)
		    	 
		     {
		    	 System.out.println(S1.getText());
		    	 
		     }
		  
		  
	}
		  
		  

}
