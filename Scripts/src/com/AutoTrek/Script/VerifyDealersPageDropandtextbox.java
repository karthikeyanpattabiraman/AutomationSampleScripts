package com.Autotrek.Script;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.Autotrek.pom.DealerPage_AT;

import generic.Excel;

public class VerifyDealersPageDropandtextbox extends BaseTest_AT{
	
	     @Test
	     public void clickDropdown() throws InterruptedException, AWTException{
	    	 
	    	 
	    	      String n=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1,0);
	    	      
	    	      String Cn=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 1);
	    	      
	    	      String Cp=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 2);
	    	      
	    	      String Cmail=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 3);
	    	      
	    	      String Cdes=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 4);
	    	      
	    	      String Ciq=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 5);
	    	      
	    	      String Al1=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 6);
	    	      
	    	      String Al2=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 7);
	    	      
	    	      String C=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 8);
	    	      
	    	      String S=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 9);
	    	      
	    	      String Pos=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"VerifyDelersPageDropandtextbox", 1, 10);
	    	   
	    	 
	    	      DealerPage_AT d = new DealerPage_AT(driver);
	    	      
	    	      d.setName(n);
	    	      
	    	      Thread.sleep(2000);
	    	      
	    	      d.setContactName(Cn);
	    	      
	    	      Thread.sleep(2000);
	    	      
	    	      d.setPhoneno(Cp);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setEmailID(Cmail);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setDesignation(Cdes);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setIqama(Ciq);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setAddress1(Al1);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setAddress2(Al2);
	    	      Thread.sleep(2000);
	    	      
	    	      d.setCity(C);
	    	      Thread.sleep(2000);
	    	      
	    	      
	    	      d.StateDropdown();
	    	      
	    	      d.setPostCode(Pos);
	    	      
	    	      d.FileUploadBrowse();
	    	      
	    	      //d.cancelClick();
	    	 
	    	  
	     }

}
