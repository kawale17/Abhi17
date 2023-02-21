package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	
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
			  
			  
			  // To Find column size of ROW 4
			  
			  
			  List <WebElement> Allcolumn=driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));  //3
			  
			              int Count =Allcolumn.size();   //3
			              
			              System.out.println(Count);
			  
		}

}
