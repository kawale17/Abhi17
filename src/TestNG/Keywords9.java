package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords9 {
	
	
	@Test       //Test Case / Method
 	
	public void Login () 
	{
    	 
		Reporter.log("Running Login TC", true);
		
	}
	
    @Test(dependsOnMethods= {"Login"})      //Test Case / Method
 	
	public void Logout () 
	{
    	 
		Reporter.log("Running Logout TC", true);
		
	}

}
