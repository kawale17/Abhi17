package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test7 {

	
	// To Get Size of Shell
	
	public static void main(String[] args) throws IOException 
	
	{
		// To Reach upto ExcelSheet
		
FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

    int ColSize = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum(); //6
		
		
		System.out.println(ColSize);
	}
}
