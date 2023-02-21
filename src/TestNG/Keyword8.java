package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword8 {
	
	
	
     @Test (timeOut=5000)        //Test Case / Method
 	
	public void TC1() throws InterruptedException
	{
    	 Thread.sleep(2000);
		
		Reporter.log("Running method TC1", true);
		
	}
	
	@Test (enabled=false)   //Test Case / Method
	public void TC2()
	{
		
		Reporter.log("Running method TC2", true);
		
	}


}
