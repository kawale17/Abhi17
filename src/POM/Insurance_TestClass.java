package POM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_TestClass {
	
	
	// How to launch/OpenBrowser in selenium
	
		public static void main(String[] args) throws Exception 
		
		{
			//Step-I:
			//Parameter-I: Name of the Browser
			//Parameter-II: Path of ChromeDriver.exefile
			
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			
			
			//Step-II-Create object of ChromeDriver class
			
			ChromeDriver driver= new ChromeDriver ();
			
			
			// To Enter URL
			
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			
			//wait
			Thread.sleep(2000);
			
		
			//Create object of POM-I class
			
			Insurance_Login Login = new Insurance_Login(driver);
			
			
			
           //Create object of POM-II class
			
			Insurance_Broker_Insurance_Webpage Broker  = new Insurance_Broker_Insurance_Webpage(driver);
			
		}


}
