package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {
	
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		  
	       // To enter url // Open an Application
		  
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		  
	       //wait
		  Thread.sleep(2000);
		  
		  //to switch to Iframe (int FrameIndex)
		  
		     driver.switchTo().frame(0);
		  
		//wait
		  Thread.sleep(2000);
		  
		  //Click me to display date and time button
		  
		  driver.findElement(By.xpath("//button[@type='button']")).click();
	  
		  
	}
	

}
