package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12 {
	
	
	//Approach-II	
			public static void main(String[] args) throws InterruptedException 
				
				
				{
					//Step-I
					//Parameter-I-Name of the Browser
					//Parameter-II-path of ChromeDriver.exe.file
					
					
					
		   System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
					
					
		   //Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
					
		      WebDriver driver = new ChromeDriver ();
					
		        // To enter URL // open an applications
					  
		        driver.get("https://www.facebook.com/");
		      
			             
			    //wait
			     Thread.sleep(2000);
			     
			     
			     //Click Create new account button
			     
			     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			     
			     //wait
			     
			     Thread.sleep(2000);
			     
			     //identify listbox & store it in object
			     
			     WebElement  Month = driver.findElement(By.xpath("//select[@id='month']"));
			     
			     //Step-II-Create object of Select class
			     
			     Select S1 = new Select(Month);
			     
			     //Step-III-Call the methods
			     
			     S1.selectByVisibleText("May");
			     
			     //To get text WebElement
			     
			         List <WebElement> S2= S1.getOptions();   // Addresses --->12
			         
			         for (WebElement S3:S2)  // jan feb march ..... dec
			         {
			        	 
			        	     String  S4=S3.getText();
			        	     
			        	     System.out.println(S4);
			         }
			     
			     
			     
				}
	
	
	
	

}
