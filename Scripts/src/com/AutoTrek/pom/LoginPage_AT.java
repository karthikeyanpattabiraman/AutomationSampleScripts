package com.Autotrek.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LoginPage_AT extends BasePage_AT{
	
	@FindBy(id="username")
	
	private WebElement unTB;
	
	 @FindBy(id="password")
	 
	 private WebElement pwTB;
	 //xpath for submit button
	 
	 @FindBy(xpath="//button[@class='btn btn-success submitbtn' and text()='Submit']")
	 
	 private WebElement submitButton;
	 
	 //xpath err mss
	 
	 @FindBy(xpath=".//small[contains(.,'Password')]")
	 
	 private WebElement errMsg;
	
	  public LoginPage_AT(WebDriver driver) {
			
	  super(driver);
			
      PageFactory.initElements(driver,this);
			
		}
  public void setUserName(String un){
		
		unTB.sendKeys(un);
	}
	
	public void setPwd(String pw){
		
		 pwTB.sendKeys(pw);
	}
	
	public void clickSubmitButton(){
		
		submitButton.click();
	}
	  
	public void VerifyErrorMsg(){
		
		boolean err=errMsg.isDisplayed();
		
		Assert.assertTrue(err);
		
	}

}
