package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords2 {
	
	
	@Test (priority=2)        //Test Case / Method
	
	public void TC1()
	{
		
		Reporter.log("Running method TC1", true);
		
	}
	
	@Test (priority=1)   //Test Case / Method
	public void TC2()
	{
		
		Reporter.log("Running method TC2", true);
		
	}
	

}
