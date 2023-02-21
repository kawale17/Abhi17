package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6 {
	
	
private static final Object ActutalResult = null;


public void TC1()
	
	{
		
		String ActualResult="Virat";
		
		Assert.assertNotNull(ActutalResult);
		
	}

	
  @Test     // Test Case / Method
	
	public void TC2()
	
	{
		
	    String ActualResult=null;
		
		Assert.assertNotNull(ActutalResult);
	}

}
