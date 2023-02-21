package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser_Testing 

{
	@Parameters ("browserName")   // Chrome Firefox
	
     @Test         // Test Case / Method
	
	public void TC1(String browserName) throws InterruptedException  // chrome firefox
	
	{
		
		WebDriver driver=null;  // chrome chrome
		
		if (browserName.equals("Chrome"))
		{
		
         System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		   driver = new ChromeDriver ();
		  
		}
		
		
		else if (browserName.equals("firefox"))
			
		{
	System.setProperty("Webdriver.gecko.driver","F:\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			 
			 driver = new FirefoxDriver ();
		}
		
		// To Enter URL
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().window().maximize();
		
		//Wait
		
		Thread.sleep(2000);
		
		//Enter Mail
	       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
	       
	     //Wait
			
		Thread.sleep(2000);
		
		// Enter Password
		
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai@1117");
			
	     //wait
	     Thread.sleep(2000);
	     
	     
	   //Click Login button
	       
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	          
	    //wait
	    Thread.sleep(2000);
	     
	  // Test case :- verify Email Address
	       
         String ExpectedEmailAddress="saradeg41@gmail.com";
          
         WebElement S1 =driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
         
         
         String  ActualEmailAddress = S1.getText(); // saradeg41@gmail.com
         
         
         if (ExpectedEmailAddress.equals(ActualEmailAddress))
      	   
         {
      	   
      	   System.out.println("Pass");
      	   
         }
		  
         else
         {
      	   
      	   System.out.println("fail");
      	   
         }
         
         
         //wait
	     Thread.sleep(2000);
	     
	     driver.close();
	       
          
	}
}
