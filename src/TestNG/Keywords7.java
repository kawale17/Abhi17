package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords7 {
	
	
	@Test        //Test Case / Method
 	
	public void TC1()
	{
		
		Reporter.log("Running method TC1", true);
		
	}
	
	@Test (enabled=false)   //Test Case / Method
	public void TC2()
	{
		
		Reporter.log("Running method TC2", true);
		
	}

}
