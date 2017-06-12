package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel{

	public  static String getCellValue(String path,String Sheet,int r,int c){
	
	String v=" ";
	
	try{
		
		FileInputStream fis=new FileInputStream(path);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		v=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
		
	}
	
	catch(Exception e){
		
		e.printStackTrace();
		
		
	}
	
	return v;
	}
	
     public static  int getRowCount(String path,String Sheet){
    	 
    	 
    	 int rc=0;
    	 
    	 try{
    		 
    		   FileInputStream fis=new FileInputStream(path);
    		   
    		   Workbook wb=WorkbookFactory.create(fis);
    		   
    		   rc=wb.getSheet(Sheet).getLastRowNum();
    		   
    	 }
    	 
    	 catch(Exception e){
    		 
    		 e.printStackTrace();
    	 }
    	 
    	 return rc;
    	 
     }
	   
	
	}


	   
		  

