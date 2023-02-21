package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement8 {
	
	
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
             
             // To Create New account
             
             driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
             
             //Wait
             Thread.sleep(2000);
             
             //verify Male radio button
             
             WebElement Radio  = driver.findElement(By.xpath("//input[@class='_8esa'][2]"));
        
             boolean Button =Radio.isSelected();  // Selected---> True Not Selected---> False
             
             System.out.println(Button);
             
	}

}
