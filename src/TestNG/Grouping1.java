package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 

{
	
  @Test(groups="Car Insurance")         // Test Case / Method
	
	public void TC1()
	
	{
		
		Reporter.log("Running Method TC1", true);
	}
	
	
   @Test (groups="Car Insurance")        // Test Case / Method
	
	public void TC2()
	
	{
	
		Reporter.log("Running Method TC2", true);
	}
	
	
    @Test  (groups="Health Insurance")       // Test Case / Method
	
	public void TC3()
	
	{
		
		Reporter.log("Running Method TC3", true);
	}
	
	
   @Test (groups="Health Insurance")           // Test Case / Method
	
	public void TC4()
	
	{
		
		Reporter.log("Running Method TC4", true);
	}
   
    
   @Test (groups="Term life Insurance")           // Test Case / Method
   public void TC5()
	
	{
		
		Reporter.log("Running Method TC5", true);
	}
	
	
  @Test (groups="Retirement Plan")           // Test Case / Method
	
	public void TC6()
	
	{
		
		Reporter.log("Running Method TC6", true);
	}

}
