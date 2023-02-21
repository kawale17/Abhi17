package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test10 {
	
	
	// To Fetch data of a perticular row
	
   public static void main(String[] args) throws IOException 
				
	{
		// To Reach upto ExcelSheet
					
FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

         Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet6");
 
         int LastCellIndex = Sh.getRow(0).getLastCellNum()-1;  //4-1=3
         
         
         //Take for loop for cell
         
         
            //i=0     0<=3      1
                  //  1<=3      2
                  //  2<=3      3
                  //  3<=3      4
                  //  4<=3      
         
         for (int i=0;   i<=LastCellIndex;   i++)  //3
         {
        	 
        	 
        	  String Value =Sh.getRow(0).getCell(i).getStringCellValue();
        	  
        	  System.out.println(Value+"");  // Rohit Rahul Virat MSD
        	 
        	 
        	 
         }
					


         
         
         
         
         
					
				}


}
