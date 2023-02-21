package Handling_of_Multiple_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	
	public static void main(String[] args) throws InterruptedException


	  // Handling of Dynamic Elements
		
		
		{
			//Step-I
			//Parameter-I-Name of the Browser
			//Parameter-II-path of ChromeDriver.exe.file
			
			
			
			System.setProperty("Webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			
			
			//Step-II-Create object of ChromeDriver class by providing reference of WebDriver (Interface)
			
			  WebDriver driver = new ChromeDriver ();  //Upcasting
			  
			//To Enter URL /Open an Application
			  
			  driver.get("https://www.flipkart.com/");
			  
			  driver.manage().window().maximize();
			  
			  //wait
			  Thread.sleep(2000);
			  
			  // Close hidden division pop up
			  
			  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			  
			   //wait
			  Thread.sleep(2000);
			  
			  //Enter "redmi note 10s"
			  
			  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
			  
			//wait
			  Thread.sleep(2000);
			  
			  //Click Search button
			  
			  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			  
			//wait
			  Thread.sleep(2000);
			  
			  //identify rating element
			   
			WebElement Rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
			
			  
			//wait
			  Thread.sleep(2000);
			  
			// to get text of an element
			  
			      String S1 =Rating.getText();
			      
			      System.out.println(S1);
			  
		}
}
