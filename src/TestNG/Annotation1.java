package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	
	@BeforeClass
	
	public void OpenBrowser ()
	{
		Reporter.log("Open Browser", true);
		
	}
	
	@BeforeMethod
	
	public void LoginToApp()
	{
		
		Reporter.log("Login To App", true);
	}
	
	@Test
	
	public void TC1 ()
	
	{
		//Verify Email Address
		
		Reporter.log("Running Method TC1", true);
			
	}
	
	@AfterMethod
	
	public void LogoutFromApp()
	{
		
		Reporter.log("Logout from App",true);
	}
	
	
	@AfterClass
	
	public void CloseBrowser()
	
	{
		
		Reporter.log("Close Browser", true);
	}

}
