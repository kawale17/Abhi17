package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
	
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		  
		  // To Enter URL
		  
		  driver.get("https://www.flipkart.com/");
		
		  driver.manage().window().maximize();
		  
		  //wait
		  Thread.sleep(2000);
		  
		  // Close Hidden division pop up
		  
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    
		  //wait
		 Thread.sleep(2000);
		 
		 //Step-I- Indetify element and store it into an object
		  WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		   
		   
		   //Step-II-Create object of Action Classes
		 Actions act = new Actions (driver);
		 
		 
		 //Step-III-call the method (Right Click)
		 
		   act.contextClick(cart).perform();
		  
		  
	
	}

}
