package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	
private static final String AcutalResult = null;
private static final boolean ActutalResult = false;


public void TC1()
	
	{
		
		boolean ActualResult=true;	
		
		Assert.assertTrue(ActutalResult);
		
	}

	
  @Test     // Test Case / Method
	
	public void TC2()
	
	{
		
	    boolean ActualResult=false;	
		
		Assert.assertTrue(ActutalResult);
	}

}
