package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{

		
		@Test         // Test Case / Method
		
		public void TC3()
		
		{
			Assert.fail();
			Reporter.log("Running Method TC3", true);
		}
		
		
	   @Test         // Test Case / Method
		
		public void TC4()
		
		{
			
			Reporter.log("Running Method TC4", true);
		}
		

}
