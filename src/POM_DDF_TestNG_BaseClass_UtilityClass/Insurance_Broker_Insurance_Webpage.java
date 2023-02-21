package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_Insurance_Webpage {
	
	
	//POM-II

		// 1-Data Member /Global Variable should be declared globally with access level
		// private
		// by using @findby Annotation

		@FindBy(xpath = "//h4[text()='saradeg41@gmail.com']")
		private WebElement Signedinas;// Private WebElement // Signedinas=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
										

		@FindBy(xpath = "//input[@class='btn btn-danger']")
		private WebElement LogoutBtn; // Private WebElement LogoutBtn=driver.findElement(By.xpath("//input[@class='btn btn-danger']"));
								

		// 2-Initialize within a Constructor with access level public using Pagefactory

		public Insurance_Broker_Insurance_Webpage(WebDriver driver) {

			PageFactory.initElements(driver, this);

		}

		// 3.Utilize within a method with access level public

		public String getEmail() // saradeg41@gmail.com
		{
			String AcutalEmailAddress = Signedinas.getText(); // saradeg41@gmail.com

			return AcutalEmailAddress;  // saradeg41@gmail.com

		}

		public void ClickLogoutBtn()

		{

			LogoutBtn.click();
		
		}

}
