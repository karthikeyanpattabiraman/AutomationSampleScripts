package com.gmail.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.gmail.Loginpage;

import Helper.BrowserFactory;
import Screenshotcapture.Utility;

public class VerifyValidGmailLogin {
	
	//ITestResult result;
	
	@Test(priority=1)
	
          public void checkValidLogin(){
		
		//launch browser
        	  
		  WebDriver driver=BrowserFactory.startBrowser("chrome", "https://accounts.google.com");
		  
		  Utility.captureScreenshot(driver,"browser1");
		  
		  //created page object using the page Factory
		  
		  Loginpage login_page=new Loginpage(driver);
		  //call the method
		  
		  login_page.Gmail_login("karthidk20", "karthiknd");
		  
		  
		  Utility.captureScreenshot(driver,"home1");
		  
		  
		  }
}  