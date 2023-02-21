package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test8 {
	
	
	// To Get last index of cell
	
		public static void main(String[] args) throws IOException 
		
		{
			// To Reach upto ExcelSheet
			
	FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

	    int Colindex = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum()-1; //6
			
			System.out.println(Colindex);
			
		}

}
