package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  

        driver.navigate().to("https://www.flipkart.com/");
        
        driver.manage().window().maximize();
        
        
        //Close Hidden division pop up
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        
        //Step-I-Identify element and store it into an object
        
         
         WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
        
        // Step-II -create object of Actions class
        
          Actions act = new Actions (driver);
        
      // Step-III- Call the method (Left Click)
          
          act.click(cart).perform();
        
        
		  
		  
		
	}

}
