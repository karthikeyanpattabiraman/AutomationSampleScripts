package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;


public class InboxGmail extends BrowserFactory{
	
	
	  @FindBy(xpath=".//*[@id=':2j']")
	    
	    WebElement Checkbox;
	    	
	    @FindBy(xpath=".//*[@id=':2']/div/div/div[6]/div/table/tbody/tr[1]/td[5]/div/span[1]/b") 
	    
	    WebElement link;
	    
	   /* @FindBy(id="link_enable_notifications_hide")
	    
	    WebElement Hidelink;*/
	    
	    @FindBy(xpath=".//*[@id=':5']/div/div[1]/div[1]/div/div/div[2]/div[3]/div/div")
	    
	    WebElement deletelink;
	    
	  


	 public  InboxGmail(WebDriver driver){
	    	
	    	super(driver);
	    	
	    	PageFactory.initElements(driver,this);
	 }
	    	
	 
	     
		    
		    public void ClickingInbox(){
		    	
		         Checkbox.click();
		         
		         link.click();
		         
		         //Hidelink.click();
		         
		        //deletelink.click();
		    }

	}


