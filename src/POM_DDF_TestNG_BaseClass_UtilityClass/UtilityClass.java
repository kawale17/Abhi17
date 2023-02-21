package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 

{

	//Automation TE:@Abhijit
	//Date:15/02/2023
	//Day:Wed
	//Title:Fetch data from property file
	
	
	@Test              //EM  //PSW
	
	public static String getDatafromPF(String key) throws IOException
	
	{
		// To Reach upto property file
		
	FileInputStream file = new FileInputStream("C:\\Users\\Abhijeet\\eclipse-workspace\\1_Oct_Morning1\\PropertyFile.properties");
	
	//Create object of properties Class
	
	 Properties prop = new Properties();
	 
	 //To open Property file
	 
	 prop.load(file);

	 // To fetch data from property file
	 String Value1 =prop.getProperty(key);  //EM  //saradeg41@gmail.com
	                                        //PSW // Sai@1117
	          
	 return Value1;  // saradeg41@gmail.com Sai@1117
		
	
	
	}
	     //Automation TE:@Abhijit
		//Date:17/02/2023
		//Day:Wed
		//Title:Fetch data from property file
	
	@Test                                      //3            // 0
	
	public static String getDatafromExcelsheet (int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	
	{
		// To Reach upto Excelsheet
		
		FileInputStream file = new FileInputStream("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		 
		    Sheet Sh =WorkbookFactory.create(file).getSheet("Sheet9"); 
		                         
		                             //3               //0
		    String Value2  =Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue(); // Insurance Broker System
		
		    return Value2;  // Insurance Broker System
	}
	
	
	
	@Test           //101
	
	public static  void CaptureScreenshot(WebDriver driver, int TestCaseID) throws IOException
	{
		
		    File Source  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		    System.out.println(Source );
		    
		    File Destination = new File("G:\\ABHIJIT\\Vcity\\Screenshot\\."+TestCaseID+".jpg");
		    
		    FileHandler.copy(Source, Destination);
		      
	}

	
		
	}
	
	


