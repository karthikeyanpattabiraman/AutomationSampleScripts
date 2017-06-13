package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions_Click.ClickElement;

public class EnterTimeTrackPage extends Basepage{

	   @FindBy(id="logoutLink")
	   
	   private WebElement logoutButton;
	   
	   @FindBy(xpath=".//div[@class='popup_menu_icon warning_icon' and @title='Warning! Password recovery function is disabled as email settings are not configured.']")
	   
	   private WebElement setclick;
	   
	   
	   public EnterTimeTrackPage(WebDriver driver){
		   
		     super(driver);
		     
		     PageFactory.initElements(driver,this);
		     
		     
		    }
	   
	   
	   public void Datepicker(){
		   
		           driver.findElement(By.id("ext-gen23")).click();
		           
		           List<WebElement> dates=driver.findElements(By.xpath(".//*[@id='ext-gen43']/tbody//td"));
		           
		           int total=dates.size();
		           
		           for(int i=0;i<=total;i++){
		        	   
		        	   String date=dates.get(i).getText();
		        	   
		        	   if(date.equals("10")){
		        		   
		        		   dates.get(i).click();
		        		   
		        		   break;
		        	   }
		           }
		           
		           
		   
	   }
	   
//this it handle the dropdown without using the select tag
	   
	  public void handleDropdown(){
		   
		   ClickElement.clickByXpath(driver, "//span[text()='Me']"); 
		   
		   
		   List<WebElement> menu=driver.findElements(By.xpath(".//span[@class='userName']"));
		   
		   
		   for(WebElement element1:menu){
			   
	             String html=element1.getText();
			      
			     if(html.equalsIgnoreCase("Barber")){
			    	
			     element1.click();
			    	
			     break;
			    }
		   }
	  }
		   
		   
		   
		   public void clickLogout(){
				
				ClickElement.clickByID(driver,"logoutLink");

				/*Actions action =new Actions(driver);
				
				action.moveToElement(driver.findElement(By.id("logoutLink"))).click().build().perform();*/
				
				}
		   
		   
		   public void SettingClickinng(){
			   
		   setclick.click();
			  
			   
			   
		}
  }

		   
		   /*for(int i=0;i<menu.size();i++)
		   {
			   
			      WebElement element=menu.get(i);
			      
			      String innerhtml=element.getAttribute("innerhtml");
			      
			    if(innerhtml.contentEquals("O'Dowd, Roy")){
			    	
			    	element.click();
			    	
			    	break;
			    }
		   }*/
		     

		


