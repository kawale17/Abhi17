package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test9 {
	
	
	
	// Read Numeric Information as a string
	
			public static void main(String[] args) throws IOException 
			
			{
				// To Reach upto ExcelSheet
				
		FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

		    String Value  = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getStringCellValue(); //6
				
				System.out.println(Value);  //1122
				
			}

}
