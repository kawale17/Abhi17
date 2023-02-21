package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo1 

{
	
	@Test         // Test Case / Method
	
	public void TC1()
	
	{
		
		Reporter.log("Running Method TC1", true);
	}
	
	
   @Test         // Test Case / Method
	
	public void TC2()
	
	{
		
		Reporter.log("Running Method TC2", true);
	}
	
	
	

}
