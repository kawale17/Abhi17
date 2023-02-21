package TestNG;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7 {
	
	
	//Drawbacks of Assert Class
	
	@Test          
	
	public void TC1()
	
	{
		
		String S1 ="Hi";
		String S2 = "Hello";
		String S3 = "Good Morning";
		
		
		Assert.assertNotEquals (S2, S1);  // AcutalResult ExpectedResult // Pass
		
		
		Assert.assertEquals (S2, S1);  // AcutalResult ExpectedResult  // fail
		
		
		Assert.assertEquals (S3, S1);  // AcutalResult ExpectedResult  // fail
		
		
		Assert.assertEquals (S1, S3);  // AcutalResult ExpectedResult  // Pass
		
	}

}
