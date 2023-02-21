package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample2 {
	
	
	// How to capture Screenshot of a webpage
	
		public static void main(String[] args) throws InterruptedException, IOException 
		
		{
			//Step-I
					//Parameter-I-Name of the Browser
					//Parameter-II-path of ChromeDriver.exe.file
					
					
					
	System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
					
					
	 //Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
					
		WebDriver driver = new ChromeDriver ();
					
		// To enter URL // open an applications
					  
			 driver.get("https://kite.zerodha.com/");

			   //wait
			 
			 Thread.sleep(2000);
			
			//take Screenshot of a webpage
			//typecast/downcasting/convert
			
			   
			     File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			     
			      System.out.println(Source);
			      
			      File Destination =new File("G:\\ABHIJIT\\Vcity\\Screenshot\\Sample12.jpg");
			      
			      
			      FileHandler.copy(Source, Destination);
			
		}

}
