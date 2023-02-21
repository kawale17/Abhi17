package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  
		  //wait
		  Thread.sleep(2000);
		  
		  //Enter Customer ID
		  
		  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
		  
		//wait
		  Thread.sleep(2000);
		  
		  // click to submit button
		  
		  driver.findElement(By.xpath("//input[@name='submit']")).click();
		  
		  // to switch to alert
		  
		      Alert Alt =driver.switchTo().alert();
       
		    //wait
			  Thread.sleep(2000);
			  
			  // Click ok Button
			  
			  Alt.dismiss();
      
        
	}

}
