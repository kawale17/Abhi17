package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	
	
public static void main(String[] args) throws InterruptedException

	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		  
		//To Enter URL /Open an Application
		  
		  driver.get("file:///G:/ABHIJIT/Vcity/Viraj%20Sir/Xpath/Table1.html");
		  
		  driver.manage().window().maximize();
		  
		  
		  //wait
		  Thread.sleep(2000);
		  
		  
		  // Fetch all data from particular Row
		  
		    
		            //i=1    1<=3   2
		                  // 2<=3   3
		                  // 3<=3   4
		                  // 4<=3 
		  
		  
		  for (int i = 1;  i<=3;   i++)  //3
		  {
			  WebElement S1=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]"));  // LHS (String)"+i+" RHS (String)
			  
              String text = S1.getText();  // 
             
             System.out.println(text);  // 1 manual 100
			  
			  
		  }
		  
		  
		  
		  
	}


}
