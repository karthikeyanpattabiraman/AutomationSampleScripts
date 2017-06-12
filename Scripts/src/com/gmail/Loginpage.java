package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;
import Screenshotcapture.Utility;

public class Loginpage extends BrowserFactory{
	
	WebDriver driver;
	
	@FindBy(id="identifierId")
    
    WebElement username;
    
    @FindBy(id="identifierNext")
    
    WebElement Next_button;
    
    @FindBy(xpath=".//input[@name='password']")
    
    WebElement password;
    
    @FindBy(id="passwordNext")
    
    WebElement Next_button1;
    
    @FindBy(id="gbwa")
    
    WebElement menuicon;
    
    @FindBy(id="gb23")
    
    WebElement gmailiconclick;
	    
	    
	    public Loginpage(WebDriver driver){
	    	
	    	super(driver);
	    	
	    	PageFactory.initElements(driver,this);
	    }
	
	    
	    
	    public void Gmail_login(String uid,String pass){
	    
	    	username.sendKeys(uid);
	    	
	    	Next_button.click();
	    	
	    	password.sendKeys(pass);
	    	
	    	Next_button1.click();
	    	
	    	menuicon.click();
	    	
	    	gmailiconclick.click();
	    	
	    	
	    	
	    }

}
