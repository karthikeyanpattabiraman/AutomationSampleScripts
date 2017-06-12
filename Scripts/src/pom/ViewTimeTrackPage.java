package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Actions_Click.ClickElement;

public class ViewTimeTrackPage extends Basepage {
	
	
	
	public ViewTimeTrackPage(WebDriver driver){
		   
	     super(driver);
	     
	     PageFactory.initElements(driver,this);
	     
	     
	    }
	
	        public void Currentmonthdropdown() throws InterruptedException{
	        	
	        	Thread.sleep(2000);
	        	
	        	  System.out.println(".....hai....");
	        	  
	        	  
	        	  
	        	  ClickElement.clickByXpath(driver, "//a[@href='/user/view_tt.do']");
	        	  
	        	  ClickElement.clickByID(driver,"ext-comp-1004");
	        	  
	        	  Thread.sleep(2000);
	        	  
	        	  
	        	  List<WebElement> list=driver.findElements(By.xpath(".//*[@id='ext-gen93']/li/a"));
	        	  
	        	  Thread.sleep(2000);
	        	  
	        	  
	        	  for(int i=0;i<list.size();i++){
	        		  
	        		     WebElement ele=list.get(i);
	        		     
	        		      String att=ele.getAttribute("innerHTML");
	        		      
	        		      if(att.contentEquals("Current week")){
	        		    	  
	        		    	    ele.click();
	        		    	    
	        		    	    break;
	        		      }
	        	  }
	        	  
	        	  //int count=list.size();
	        	  
	        	 /* for(WebElement element2 :list){
	        		  
	        		    String text=element2.getAttribute("innerHTML");
	        		    
	        		    if(text.contentEquals("Current week")){
	        		    	
	        		    	element2.click();
	        		    	
	        		    	//break;
	        		    }
	        		    
	        		   
	        	  }*/
	        	  
	        	  System.out.println(".....clicked....");
	        }

}
