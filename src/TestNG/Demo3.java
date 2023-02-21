package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{

	@Test         // Test Case / Method
	
	public void TC5()
	
	{
		
		Reporter.log("Running Method TC5", true);
	}
	
	
   @Test         // Test Case / Method
	
	public void TC6()
	
	{
		Assert.fail();
		Reporter.log("Running Method TC6", true);
	}
	

}
