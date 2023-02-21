package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test10 {
	
	
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
					  
		        driver.get("file:///G:/ABHIJIT/Vcity/Viraj%20Sir/Xpath/MultiSelectable%20Listbox.html");
		      
			             
			    //wait
			     Thread.sleep(2000);
			                    
			     //Step-I-Identify listbox and store it into an object
				     
			       WebElement Multiselectable =driver.findElement(By.xpath("//select[@id='1234']"));
			       
			       
			    //Step-II-Create object of Select class
			       
			       Select S1 = new Select (Multiselectable);
			       
			     //Step-III-Call the methods
			       
			       S1.selectByIndex(0);  // IND
			       
			       Thread.sleep(1000);
			      		       
			       S1.selectByIndex(3); // SRI
			       
			       S1.selectByIndex(2);  //Pak
			       
			       //To get text of all selected options
			       
			        List <WebElement> Addresses =S1.getAllSelectedOptions();  // Address--->3
			          
			                  for(WebElement S2: Addresses)  // IND SRI PAK
			                  {
			                	        String S3 =S2.getText(); // IND SRI PAK
			                	        
			                	        System.out.println(S3);
			                	  
			                  }
			      
			       
				}

}
