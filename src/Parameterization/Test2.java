package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		
		// To Reach upto Excelsheet 
		
FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		

      String Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
      
         System.out.println(Value);
	}
	
	

}
