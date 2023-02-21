package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		// to get size of row
		
FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		

 int Rowsize = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1 ;// 3+1 = 4
		
		System.out.println(Rowsize);
 
 
	}
}
