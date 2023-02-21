package Launch_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_method10 {
	
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
        
        //wait
        Thread.sleep(2000);
        
        // to get size of the browser
        
        
        
      Dimension S1 = driver.manage().window().getSize();
        
        System.out.println(S1);
        
        
	}
}


