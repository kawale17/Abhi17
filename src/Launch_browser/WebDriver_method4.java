package Launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method4 {
	
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  

        driver.navigate().to("https://www.flipkart.com/");
		  
		  
		
	}

}
