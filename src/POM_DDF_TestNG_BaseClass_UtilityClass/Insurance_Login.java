package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Login 

{
	
	//POM-I

		// 1-Data Member /Global Variable should be declared globally with access level
		// private
		// by using @findby Annotation

		@FindBy(xpath ="//input[@id='email']")
		private WebElement Email;// Private WebElement  Email=driver.findElement(By.xpath("//input[@id='email']"));
									

		@FindBy(xpath = "//input[@id='password']")
		private WebElement Password; // Private WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
										

		@FindBy(xpath = "//input[@type='submit']")
		private WebElement Loginbtn; // Private WebElement Loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
										

		// 2-Initialize within a Constructor with access level public using Pagefactory

		public Insurance_Login(WebDriver driver) 
		{

			PageFactory.initElements(driver, this);
		}

		
		
		// 3. utilize within a method with access level public

		public void EnterEmail(String EmailAddress) // saradeg41@gmail.com

		{
			Email.sendKeys(EmailAddress); // saradeg41@gmail.com

		}

		public void EnterPassword(String Pass) // Sai@1117

		{
			Password.sendKeys(Pass); // Sai@1117

		}

		public void ClickLoginBtn()

		{

			Loginbtn.click();

		}

}
