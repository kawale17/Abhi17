package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {
	
	
	public static void main(String[] args) throws IOException 
	
	{
		
		// To Reach upto Excelsheet
		
		FileInputStream file = new FileInputStream("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		
		
		double Value =WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue(); //12345
		
		System.out.println(Value);
		
	}

}
