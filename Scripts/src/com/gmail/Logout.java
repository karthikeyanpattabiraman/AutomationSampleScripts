package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;

public class Logout extends BrowserFactory{
	
      @FindBy(xpath=".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
      
      WebElement K_button;
      
      @FindBy(id="gb_71")
      
      WebElement Signoutbutton;
      
      public Logout(WebDriver driver){
	    	
	    	super(driver);
	    	
	    	PageFactory.initElements(driver,this);
	    }
      
      public void Gmail_Signout(){
    	  
    	    K_button.click();
    	    
    	    Signoutbutton.click();
    	     
      }
      
	
      
      
    
                 

}
