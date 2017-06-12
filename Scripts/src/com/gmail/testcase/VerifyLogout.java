package com.gmail.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gmail.InboxGmail;
import com.gmail.Loginpage;
import com.gmail.Logout;

import Helper.BrowserFactory;

public class VerifyLogout {
	
	   
       @Test(priority=3)
       
       public void checkValidLogout(){
    	   
    	      
    	   WebDriver driver=BrowserFactory.startBrowser("chrome", "https://accounts.google.com");
    	   
    	   Loginpage login_page=new Loginpage(driver);
 		  //call the method
 		  
 		  login_page.Gmail_login("karthidk20", "karthiknd");
 		  
 		 
 		  
 		  
 		  InboxGmail inbox_gmail=new InboxGmail(driver);
 		  
 		  
 		  inbox_gmail.ClickingInbox();
 		  
 		  
 		  Logout log=new Logout(driver);
 		  
 		  log.Gmail_Signout();
 		  
 		  
    	      
       }
}
