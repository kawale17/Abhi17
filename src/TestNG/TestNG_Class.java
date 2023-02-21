package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Class {
	
	
	@Test   // Test case/method
	
	public void OpenFacebook () throws InterruptedException
	
	{
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();  //Upcasting
		
		// To enter URL
		  
		  driver.get("https://kite.zerodha.com/");
		  
		  
		  //wait
		  Thread.sleep(2000);
		  
		  
		  driver.manage().window().maximize();
	}
	
	

}
