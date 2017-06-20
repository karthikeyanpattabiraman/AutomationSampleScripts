package com.Autotrek.Script;

import org.testng.annotations.Test;

import com.Autotrek.pom.LoginPage_AT;

import generic.Excel;

public class ValidAutrekLogin extends BaseTest_AT {
	
	@Test
	  public void testvalidloginAT() throws InterruptedException{
		  
        String un=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"ValidAutrekLogin",1,0);
		  
		  String pw=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"ValidAutrekLogin",1,1);
		  
		  //String hp=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"ValidAutrekLogin", 1,2);
		  
		  String lp=Excel.getCellValue(AutomationConstant_AT.XL_PATH,"ValidAutrekLogin", 1,2);
		  
		  LoginPage_AT l =new LoginPage_AT(driver);
		  
		  
		  
		  l.setUserName(un);
		  
		  l.setPwd(pw);
		  
		  Thread.sleep(3000);
		  
		  l.verifyTitle(lp);
		
		  l.clickSubmitButton();
		  
		  
         
    }	
}