package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Test8 {
	
	
public void TC1()
	
	{
	
	  SoftAssert soft = new SoftAssert();
		
		String S1 ="Hi";
		String S2 = "Hello";
		String S3 = "Good Morning";
		
		

		soft.assertEquals (S2, S1);   // AcutalResult ExpectedResult  // fail
		
		
		soft.assertNotEquals (S1, S2);  // AcutalResult ExpectedResult  // Pass
		
		
		soft.assertEquals (S1, S3);  // AcutalResult ExpectedResult  // fail
		
		
		soft.assertEquals (S1, S3);  // AcutalResult ExpectedResult  // Pass
		
		soft.assertAll();
		
	}

}
