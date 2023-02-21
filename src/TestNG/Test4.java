package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
	
	
private static final boolean ActutalResult = false;


public void TC1()
	
	{
		
		boolean ActualResult=false;	
		
		Assert.assertFalse(ActutalResult);
		
	}

	
  @Test     // Test Case / Method
	
	public void TC2()
	
	{
		
	    boolean ActualResult=true;	
		
		Assert.assertFalse(ActutalResult);
	}

}
