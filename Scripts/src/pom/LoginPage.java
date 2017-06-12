package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Basepage{
	
	 @FindBy(id="username")
	 
	 private WebElement unTB;

	 
	 @FindBy(name="pwd")
	 
	 private WebElement pwTB;
	 
	 @FindBy(id="loginButton")
	 
	 private WebElement loginButton;
	 
	 @FindBy(xpath=".//span[contains(.,'invalid')]")
	 
	 private WebElement errMsg;
	 
	 public LoginPage(WebDriver driver){
		 
		 super(driver);
		 
		 
		 PageFactory.initElements(driver,this);	
	 }
     
     public void setUserName(String un){
    	 
    	 unTB.sendKeys(un);
     }
     
     public void setPwd(String pw){
    	 
    	 pwTB.sendKeys(pw);
     }
     
     public void clickLoginButton(){
    	 loginButton.click();
     }
     
    public void VerifyErrMsg(){
    	 
    	boolean s=errMsg.isDisplayed();
    	
    	Assert.assertTrue(s);
     }


	 }
	 
	 
	 
	
	 
	 

