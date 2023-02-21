package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Right_left

{
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		  
		  // To Enter URL
		  
		  driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		  
		  driver.manage().window().maximize();
		
		  
		//Identify element upto we have to scroll
		  
	      WebElement Element =driver.findElement(By.xpath("//div[@class='canvas-middle'][6]"));
	  
	  
       //To perform scrollInto view
	 
	     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);
		  
	}
	
	

}
