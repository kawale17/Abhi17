package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement6 {

	
	
private static final WebElement ForgottenPassword = null;

public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  
		  driver.get("https://www.facebook.com/");

             
             
             //wait
             Thread.sleep(2000);
             
             
             //verify login button is enabled or disabled
             
            WebElement S1 =driver.findElement(By.xpath("//button[@name='login']"));
             
             boolean S2 = S1.isDisplayed();
              
              System.out.println(S2);
             
	}
}
