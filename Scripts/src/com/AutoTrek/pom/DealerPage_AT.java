package com.Autotrek.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DealerPage_AT  extends BasePage_AT{
	
	  @FindBy(xpath=".//a[contains(.,'Dealership Entrollment')]")
	  
	  private WebElement nameTB;
	  
	  @FindBy(name="contactname")
	  
	  private WebElement contactTB;
	  
	  @FindBy(name="mobile")
	  
	  private WebElement phoneTB;
	  
      @FindBy(name="email")
	  
	  private WebElement emailTB;
	  
      @FindBy(name="designation")
	  
	  private WebElement desginationTB;
      
      @FindBy(name="iqamano")
	  
	  private WebElement iqamaTB;
      
      @FindBy(name="address1")
	  
	  private WebElement address1TB;
      
      @FindBy(name="address2")
	  
	  private WebElement address2TB;
      
      @FindBy(name="city")
	  
	  private WebElement cityTB;
      
      
      @FindBy(name="state")
	  
	  private WebElement stateDrop;
      
      
      @FindBys({@FindBy(xpath=".//select[@class='input-xlarge box ng-pristine ng-invalid ng-touched']/option")})
      
      private List<WebElement> dropstateList;
      
      
      @FindBy(name="postalcode")
	  
	  private WebElement postalTB;
      
      @FindBy(xpath=".//label[@class='upload-button']/span[contains(.,'Browse')]")
      
      private WebElement browseBtn;
      
      @FindBy(linkText="Save")
      
      private WebElement saveBtn;
      
      @FindBy(linkText="Cancel")
      
      private WebElement cancelBtn;
      
      
      public DealerPage_AT(WebDriver driver) {
			
    	  super(driver);
    			
          PageFactory.initElements(driver,this);
    			
    		}
      
      
      public void setName(String name){
    	  
    	  nameTB.sendKeys(name);
    	  
      }
      
      
      public void setContactName(String Contname){
    	  
    	  contactTB.sendKeys(Contname);
    	  
      }
      
      public void setPhoneno(String num){
    	  
    	  phoneTB.sendKeys(num);
    	  
      }
     
      public void setEmailID(String eid){
    	  
    	   emailTB.sendKeys(eid);
      }
      
      public void setDesignation(String des){
    	  
    	  desginationTB.sendKeys(des);
      }
      
      public void setIqama(String iq){
    	  
    	  iqamaTB.sendKeys(iq);
      }
      
      public void setAddress1(String ad1){
    	  
    	  address1TB.sendKeys(ad1);
      }  
      
      public void setAddress2(String ad2){
    	  
    	  address2TB.sendKeys(ad2);
      } 
      
      public void setCity(String cty){
    	  
    	  cityTB.sendKeys(cty);
    	  
      }
      
      public void setPostCode(String pcode){
    	  
    	  postalTB.sendKeys(pcode);
      }
     
      public void  saveClick(){
    	  
    	      saveBtn.click();
      }
      
      public void cancelClick(){
    	  
    	     cancelBtn.click();
      }
      
       
      public void StateDropdown() throws InterruptedException{
   
    	  
    	          Select state = new Select(stateDrop);
    	         
    	          
    	          state.selectByVisibleText("Asir");
    	          
    	          Thread.sleep(3000);
    	          
    	          state.selectByIndex(3);  
    	          
    	         //List<WebElement> drop=dropstateList.findElements(By.xpath(".//select[@class='input-xlarge box ng-pristine ng-invalid ng-touched']/option"));
    	         
    	         //List<WebElement> drop=state.getOptions();
    	         
    	         //int total=drop.size();
    	         
    	         //for(WebElement e:drop){
    	        	 
    	        	 //String text= e.getText();
    	        	 
    	        	 
    	         }
      
      
      public void FileUploadBrowse() throws AWTException{
    	  
    	          browseBtn.click();
    	          
    	          Robot robot=new Robot();
    	          
    	          robot.setAutoDelay(2000);
    	          
    	          StringSelection stringselection=new StringSelection("C:\\Users\\karthikeyanp\\TestCase_AT\\ViewUsers_AT.xlsx");
    	          
    	          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
    	          
    	          robot.setAutoDelay(2000);
    	          
    	          robot.keyPress(KeyEvent.VK_CONTROL);
    			     
    			  robot.keyPress(KeyEvent.VK_V);
    			     
    			  robot.keyRelease(KeyEvent.VK_CONTROL);
    			     
    			  robot.keyRelease(KeyEvent.VK_V);
    			     
    			  robot.setAutoDelay(2000);
    			     
    			  robot.keyPress(KeyEvent.VK_ENTER);
    			     
    			  robot.keyRelease(KeyEvent.VK_ENTER);
      }
    	         
    	         
    	         
    	  
    	       
      }
      
      
      
	  
	
	   


