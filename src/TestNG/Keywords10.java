package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords10 

   {
   
	
   @Test       //Test Case / Method
 	
	public void Login () 
	{
	   Assert.fail();
    	 
		Reporter.log("Running Login TC", true);
		
	}
	
    @Test(dependsOnMethods= {"Login"})      //Test Case / Method
 	
	public void Logout () 
	{
    	 
		Reporter.log("Running Logout TC", true);
		
	}
	
	
	
}
