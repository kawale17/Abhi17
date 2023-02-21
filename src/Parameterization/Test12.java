package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test12 {
	
	
	// To Fetch data all the data
	
	   public static void main(String[] args) throws IOException 
					
		{
			// To Reach upto ExcelSheet
						
	FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");

	         Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet8");
	 
	         int LastRowIndex = Sh.getLastRowNum();  //4-1=3
	         
	         
	         //outer loop for rows
	         
	         
	            //i=0     0<=3      1
	                  //  1<=3      2
	                  //  2<=3      3
	                  //  3<=3      4
	                  //  4<=3      
	         
	         for (int i=0;   i<=LastRowIndex;   i++)  //  1  //3  //2-1
	         {
	        	 
	        	 
	        	   int LastCellIndex = Sh.getRow(i).getLastCellNum()-1;
	        	 
	        	   
	        	   // inner for loop cell
	        	   
	        	      // a=0   0<=1       1
	        	            // 1<=1       2
	        	             //2<=1       
	        	   
	        	   
	        	   for (int a =0; a<=LastCellIndex;  a++)   //3  //1
	        	 
	        		   
	        	   {
	        		   
	        		   String value = Sh.getRow(i).getCell(a).getStringCellValue(); 
	        		     
	        		     
	        		     System.out.print(value+" ");
	        		     
	        		     //Surya rewr ee
	        		     // KL rewr
	        		     // Hardik we ew
	        		     // Shubham wtre
	        		     
	        		     
	        	   }
	        	 
	        	   System.out.println();
	         }
		}

}
