package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division {
	
	
public static void main(String[] args) throws InterruptedException 
	  
     //Handle Division Pop Up
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  

        driver.navigate().to("https://www.flipkart.com/");
        
        //wait
        Thread.sleep(2000);
        
        // Enter Email \Mobile No
         
       driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc@gmail.com");
        
       //wait
       
       Thread.sleep(2000);
       
       //Click request OTP Button
       
       driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        
      
        
	}

}
