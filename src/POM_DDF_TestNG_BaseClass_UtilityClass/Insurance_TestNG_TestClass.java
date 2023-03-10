package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;



public class Insurance_TestNG_TestClass extends BaseClass

{
	
	     //public WebDriver driver;
		//InitializeBrowser() 
		
		Insurance_Login Login;
		Insurance_Broker_Insurance_Webpage Broker;
		
		int TestCaseID;

		@BeforeClass
		public void OpenBrowser() 
		{
			InitializerBrowser();
			
			 //Create Object Of POM-I Class
			Login=new Insurance_Login(driver);
			
			//Create object of POM-II Class
	        Broker=new Insurance_Broker_Insurance_Webpage(driver);

		}
		
		
		@BeforeMethod
		public void loginToApp() throws IOException 
		{
			Login.EnterEmail(UtilityClass.getDatafromPF("EM")); //saradeg41@gmail.com
			
			Login.EnterPassword(UtilityClass.getDatafromPF("PSW"));  //Sai@1117
			
			Login.ClickLoginBtn();
			
		}
		
		@Test(priority=1)                                 //Test Case/method
		public void VerifyEmailAddress() throws EncryptedDocumentException, IOException 
		{
		
			TestCaseID=100;
			
			//verify Email Address
			String ActualEmail=Broker.getEmail();   //saradeg41@gmail.com

			String ExpectedEmail=UtilityClass.getDatafromExcelsheet(2, 0);  //saradeg41@gmail.com
		
			Assert.assertEquals(ActualEmail,ExpectedEmail);		
		}
		
		@Test(priority=2) 
		public void VerifyTitle() throws EncryptedDocumentException, IOException
		{    
			TestCaseID=101;
			
			String ActualTitle=driver.getTitle();  //Insurance Broker System
			
			String ExpectedTitle=UtilityClass.getDatafromExcelsheet(3, 0);  //Insurance Broker System1
			
			Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
		
		
		@AfterMethod                          //Fail
		public void LogoutFromApp(ITestResult Result) throws IOException   //Pass Fail
		
		{       //Fail                   //Fail
			if(Result.getStatus()==ITestResult.FAILURE) 
				
			{
				UtilityClass.CaptureScreenshot(driver, TestCaseID);  //101
				
			}
			
			Broker.ClickLogoutBtn();
		}
		
		@AfterClass
		
		public void CloseBrowser() 
		{
			driver.close();
			
		}
		
}
