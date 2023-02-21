package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser1 {

	

	// How to launch/OpenBrowser in selenium
	
	public static void main(String[] args) 
	
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II: Path of ChromeDriver.exefile
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step-II-Create object of ChromeDriver class
		
		ChromeDriver driver = new ChromeDriver ();
}
}