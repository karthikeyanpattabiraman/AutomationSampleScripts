package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class Basepage {

	       public WebDriver driver;
	       
	       public Basepage(WebDriver driver){
	    	   
	    	   this.driver=driver;
	    	   
	      PageFactory.initElements(driver,this);	   
	       }
	       


		public void verifyTitle(String eTitle){
	    	   
	    	   String aTitle = driver.getTitle();
	    	   
	    	   Assert.assertEquals(aTitle,eTitle);
	       } 
		
		
}
