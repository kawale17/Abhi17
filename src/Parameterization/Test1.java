package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Test1 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		
		// To reach upto Excelsheet
		
		FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		
		
		// to open an excelsheet
		
		  Workbook S1= WorkbookFactory.create(file);
		  
	    // To Enter perticular sheet
		    
		   Sheet Sh = S1.getSheet("Sheet1");
		      
		  // To highlight row
		      
		  Row S2=Sh.getRow(0);
		  
		  //To Highlight Cell /column
		  
		      Cell S3=S2.getCell(0);
		      
		   // To fetch information
		      
		       String info = S3.getStringCellValue();  // abc
		       
		       System.out.println(info);
		
		
	}

}
