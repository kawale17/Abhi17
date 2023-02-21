package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 {
	
private static final Object ActutalResult = null;


public void TC1()
	
	{
		
		String ActualResult=null;
		
		Assert.assertNull(ActutalResult);
		
	}

	
  @Test     // Test Case / Method
	
	public void TC2()
	
	{
		
	    String ActualResult="Virat";
		
		Assert.assertNull(ActutalResult);
	}


}
