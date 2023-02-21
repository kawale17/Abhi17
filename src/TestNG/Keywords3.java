package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords3 {
	
	
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
	
	@Test    //By Default =Priority=0  //Test Case / Method
	public void TC3()
	{
		
		Reporter.log("Running method TC3", true);
		
	}

}
