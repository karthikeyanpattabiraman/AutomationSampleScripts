package Modules;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class loginxlsx {

	
	 
	public static void main(String[] args) throws Exception{
		  
		   File src = new File("C:\\Users\\karthikeyanp\\Documents\\test.xlsx");
		   
		   FileInputStream fis=new FileInputStream(src);
		   
		   XSSFWorkbook wb = null;
		   
		   try {
			   wb = new XSSFWorkbook(fis);
		   } catch (Exception e){
			   e.printStackTrace();
		   }
		   
		   XSSFSheet sheet1 = wb.getSheetAt(0);
		   
		   String data = sheet1.getRow(1).getCell(0).getStringCellValue();
		   
		   System.out.println("Data from excel is " + data);
		   
	  }
}
