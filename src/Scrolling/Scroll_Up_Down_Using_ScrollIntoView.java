package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down_Using_ScrollIntoView 

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
		  
		  driver.get("https://demo.guru99.com/test/guru99home/");
		  
		  driver.manage().window().maximize();
		
		  
		  //wait
		  Thread.sleep(2000);
		  
		  //Identify element upto we have to scroll
		  
		      WebElement ele =driver.findElement(By.xpath("//a[text()='Facebook']"));
		  
		  
           //To perform scrollInto view
		 
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		  
	}

}
