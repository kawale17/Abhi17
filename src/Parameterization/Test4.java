package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {
	
	
	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream file = new FileInputStream("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		
		
		 boolean Value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(1).getBooleanCellValue();
		  
		  // True
		 System.out.println(Value);
	}

}
