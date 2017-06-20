package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicRadioandCheckbox {
	
	  public static void main(String[] args) throws InterruptedException{
		  
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		     
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("http://seleniumpractise.blogspot.in/search?updated-max=2017-01-07T21:30:00-08:00&max-results=7");
			 
			 Thread.sleep(3000);
			 
			 driver.manage().window().maximize();
			 
			 Thread.sleep(3000);
			 
			 //clicking the chekbox
			 
			 List<WebElement> chk=driver.findElements(By.xpath(".//input[@type='checkbox'] " ));
			 
			 for(int i=0;i<chk.size();i++){
				 
				      WebElement chkname=chk.get(i);
				      
				       String name=chkname.getAttribute("name");//here using the name because in this case the name differs for each chkbox
				       
				       if(name.equalsIgnoreCase("Maths")){
				    	   
				    	   chkname.click();
				       
				       
			 }
	  }
			    Thread.sleep(3000);
			    
			    List<WebElement> radios=driver.findElements(By.xpath(".//input[@type='radio']"));
			    
			      for(int i=0;i<radios.size();i++){
			    	  
			    	         WebElement values=radios.get(i);
			    	         
			    	         String value=values.getAttribute("value");
			    	         
			    	         if(value.equalsIgnoreCase("physics")){
			    	        	 
			    	        	     values.click();
			    	         }
			      }
			  
	  }
}
