package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test11 {

	
	// To Fetch data of a perticular cell
	
	   public static void main(String[] args) throws IOException 
					
		{
			// To Reach upto ExcelSheet
						
	FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

	         Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet7");
	 
	         int LastRowIndex = Sh.getLastRowNum();  //4-1=3
	         
	         
	         //Take for loop for cell
	         
	         
	            //i=0     0<=3      1
	                  //  1<=3      2
	                  //  2<=3      3
	                  //  3<=3      4
	                  //  4<=3      
	         
	         for (int i=0;   i<=LastRowIndex;   i++)  //3
	         {
	        	 
	        	 
	        	  String Value =Sh.getRow(i).getCell(0).getStringCellValue();
	        	  
	        	  System.out.println(Value);  // Surya KL Hardik Shubhman
	        	 
	        	 
	        	 
	         }
						


	         
	         
	         
	         
	         
						
					}
}
