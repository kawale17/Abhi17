package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	
	
	// With_DDF
	
	
		public static void main(String[] args) throws InterruptedException, IOException
		
		
		{
				//Step-I
				//Parameter-I-Name of the Browser
				//Parameter-II-path of ChromeDriver.exe.file		
				
	System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				
				
	//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
				
				 WebDriver driver = new ChromeDriver ();  //Upcasting
				  
				  
	    // To Enter URL
				
	    driver.get("https://demo.guru99.com/insurance/v1/index.php");
	    
	    driver.manage().window().maximize();
				
	  //wait
	  Thread.sleep(2000);      			  
	     
  // To Read  Data from Excelsheet
	       
FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
 
   Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet9");
	          
	//Enter Mail
    String EmailAddress  =Sh.getRow(0).getCell(0).getStringCellValue(); //saradeg41@gmail.com
   
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailAddress);
	 
	//wait
     Thread.sleep(2000);       
	 
    // Enter Password
     
     String Password  =Sh.getRow(1).getCell(0).getStringCellValue(); // Sai@1117
		
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	  
     //wait
     Thread.sleep(1000);
	        
   //Click Login button
     
     driver.findElement(By.xpath("//input[@type='submit']")).click();		
	      
     //wait
     Thread.sleep(2000);
          
  // Test case :- verify Email Address
     
     String ExpectedEmailAddress= Sh.getRow(2).getCell(0).getStringCellValue();
      
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
	
   }


 }
                        
	           