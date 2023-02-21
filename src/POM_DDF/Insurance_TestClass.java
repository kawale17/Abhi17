package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Insurance_Broker_Insurance_Webpage;
import POM.Insurance_Login;

public class Insurance_TestClass {
	
			public static void main(String[] args) throws InterruptedException, IOException
			
			{
				//Step-I:
				//Parameter-I: Name of the Browser
				//Parameter-II: Path of ChromeDriver.exefile
				
				System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				
				
				//Step-II-Create object of ChromeDriver class
				
				WebDriver driver= new ChromeDriver ();
				
				
				// To Enter URL
				
				driver.get("https://demo.guru99.com/insurance/v1/index.php");
				
				driver.manage().window().maximize();
				
				
				//wait
				Thread.sleep(2000);
				
				
				// To reach upto Excelsheet
				
				FileInputStream file =new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
				
				Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet9");
				
				//Create object of POM-I class
				
				Insurance_DDF_Login Login = new Insurance_DDF_Login(driver);
				
				//Enter Email
				
	         String EM =Sh.getRow(0).getCell(0).getStringCellValue(); // saradeg41@gmail.com
				  
			  Login.EnterEmail(EM);			// saradeg41@gmail.com
				  
				//wait
				Thread.sleep(2000);
				
				//Enter Password
				   String PSW =Sh.getRow(1).getCell(0).getStringCellValue();  //@Sai1117
				   Login.EnterPassword(PSW); //@Sai1117  
				   
				  
				   //Click login button
				   
				   Login.ClickLoginBtn();
				  
				
	           //Create object of POM-II class
				
				Insurance_DDF_Broker_Insurance_Webpage Broker  = new Insurance_DDF_Broker_Insurance_Webpage(driver);
				
				
				// To get Expected result
				
				  String Expected = Sh.getRow(2).getCell(0).getStringCellValue();   // saradeg41@gmail.com
				  
				  Broker.VerifyEmailAddress(Expected);
				  
				  
				    //wait
					Thread.sleep(2000);
					
					
		           // Click Logout Button
					Broker.ClickLogoutBtn();
					
					
			}


}
