package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {
	
public static void main(String[] args) throws IOException 
	
	{
		
  FileInputStream file = new FileInputStream ("G:\\ABHIJIT\\Vcity\\Parameterization\\Book1.xlsx");
		
  
     int Rowindex =WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
     
     System.out.println(Rowindex);
		
	}


}
