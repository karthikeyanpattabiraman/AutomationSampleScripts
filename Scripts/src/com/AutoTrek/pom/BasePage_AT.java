package com.Autotrek.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class BasePage_AT{
	
	public WebDriver driver;
    
    public BasePage_AT(WebDriver driver){
 	   
 	   this.driver=driver;
 	   
     PageFactory.initElements(driver,this);	   
    }
    


	public void verifyTitle(String eTitle){
 	   
 	   String aTitle = driver.getTitle();
 	   
 	   Assert.assertEquals(aTitle,eTitle);
    } 

}
