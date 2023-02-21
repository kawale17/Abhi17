package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 

    

{
	public WebDriver driver;
	
	public void InitializerBrowser()
	
	{
	
	//Step-I:
	//Parameter-I: Name of the Browser
	//Parameter-II: Path of ChromeDriver.exefile
	
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	
	
	//Step-II-Create object of ChromeDriver class
	
	   driver= new ChromeDriver ();   //Upcasting
	
	
	// To Enter URL
	
	driver.get("https://demo.guru99.com/insurance/v1/index.php");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	

}
