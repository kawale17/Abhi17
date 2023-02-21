package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {
	
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		  
		  // To Enter URL
		  
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  
		  driver.manage().window().maximize();
		
		  
		  //wait
		  Thread.sleep(2000);
		  
		  //Step-I-Identify element and store it into an object
		  
		   WebElement Button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		   
		 //Step-II-Create object of Actions Class
		   
		        Actions act = new Actions (driver);
		        
		//Step-III-Call the method (Double click Action)
		        
		      act.doubleClick(Button).perform();
		      
		        
	
	}


}
