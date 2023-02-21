package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Keywords1 {

	// To Run Test case Multiple Times 
	
	
	@Test (invocationCount=10)   // Test case/ Method
	
	public void TC1()
	
	{
		
		Reporter.log("Running Method TC1", true);
		
	}
}
