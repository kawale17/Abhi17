package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emaillable_Report


{
	
		@Test      //Test Case /method
		
		public void m1()
		{
			
			Reporter.log("Running Method m1",true);
		}
		
		
        @Test      //Test Case /method
		
		public void m2()
		{
			//Assert.fail();
			Reporter.log("Running Method m2",true);
		}
		
        @Test      //Test Case /method
		
		public void m3()
		{
			
			Reporter.log("Running Method m3",false);
		}
        
        @Test      //Test Case /method
		
		public void m4()
		{
			
			Reporter.log("Running Method m4");
		}
        
        
        @Test      //Test Case /method
		
		public void m5()
		{
			
			System.out.println("Running Method m5");
		}
        
	}


