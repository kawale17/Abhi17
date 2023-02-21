package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down 
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
		  
		  //Scroll Down : Enter 2nd parameters +ve pixel value
		  
		  ((JavascriptExecutor)driver).executeScript("windows.scrollBy(0,1000)");
		  
		//wait
		  Thread.sleep(2000);
		  
           //Scroll Down : Enter 2nd parameters +ve pixel value
		  
		  ((JavascriptExecutor)driver).executeScript("windows.scrollBy(0,-500)");
		  
		  
	}
}
