package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_Insurance_Webpage {
	
	
   //POM-II
	
	
    //1-Data Member /Global Variable should be declared globally with access level private 
	// by using @findby Annotation
	
	@FindBy (xpath="//h4[text()='saradeg41@gmail.com']") private WebElement Signedinas;
	
	@FindBy (xpath="//input[@class='btn btn-danger']") private WebElement LogoutBtn; 
	
	//2-Initialize within a Constructor with access level public using Pagefactory
	
	public Insurance_Broker_Insurance_Webpage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	
	}
	
}