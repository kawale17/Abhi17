package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	
@Test     // Test Case / Method
	
	public void TC1()
	
	{
		
		String ExpectedResult ="Hello";
		
		String AcutalResult ="Hi";
		
		Assert.assertNotEquals(AcutalResult, ExpectedResult);
		
	}

	
  @Test     // Test Case / Method
	
	public void TC2()
	
	{
		
		String ExpectedResult ="Hi";
		
		String AcutalResult ="Hi";
		
		Assert.assertNotEquals(AcutalResult, ExpectedResult);
	}

}
