package com.gmail.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gmail.InboxGmail;
import com.gmail.Loginpage;

import Helper.BrowserFactory;

public class VerifyInboxGmail  {
	
	WebDriver driver;

	@Test(priority=2)
	  
	  public void checkInbox(){
		  
		  WebDriver driver=BrowserFactory.startBrowser("chrome", "https://accounts.google.com");
		  
		  Loginpage login_page=new Loginpage(driver);
		  //call the method
		  
		  login_page.Gmail_login("karthidk20", "karthiknd");
		  
		  InboxGmail inbox_gmail=new InboxGmail(driver);
		  
		  inbox_gmail.ClickingInbox();
		  
		                           }
	 }
