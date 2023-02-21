package Pop_up;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
public static void main(String[] args) throws InterruptedException 
	
	
	{
		//Step-I
		//Parameter-I-Name of the Browser
		//Parameter-II-path of ChromeDriver.exe.file
		
		
		
		System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
		
		  WebDriver driver = new ChromeDriver ();
		
		// To enter URL // open an applications
		  
		  driver.get("https://skpatro.github.io/demo/links/");
		  
		  //wait
		  Thread.sleep(2000);
		  
		  // Click to new tan button
		  
		  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		  
		  //wait
		  Thread.sleep(2000);
		  
		  
		  // to get IDs
		  
		     Set <String> IDs =driver.getWindowHandles();  //mainpageID   // ChildwindowID
		     
		     System.out.println(IDs);
		     
		  ArrayList<String> al = new ArrayList<String>(IDs);  //mainpageID   // ChildwindowID
		  
		  // to get MainpageID
		     String MPID= al.get(0);   //mainpageID
		     
		     System.out.println(MPID);
		     
		  // to get ChildpageID
		     String CWID= al.get(1);  // ChildwindowID
		     
		     System.out.println(CWID);
		     
		  // TO Switch to window Pop up
		     
		     driver.switchTo().window(CWID);
		     
		     //Click Training link
		     
		     driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		     
		     //wait
		     Thread.sleep(2000);
		     
		     //To Switch to main page
		     
		     driver.switchTo().window(MPID);
		     
		   //wait
		     Thread.sleep(2000);
		     
		     // Click New Window button
		     
		     driver.findElement(By.xpath("//input[@name='NewWindow']")).click(); 
		  
	}

}
