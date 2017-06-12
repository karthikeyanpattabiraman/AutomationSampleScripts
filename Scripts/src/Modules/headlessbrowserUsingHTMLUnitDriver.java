package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class headlessbrowserUsingHTMLUnitDriver {
	@Test
	 public  void verifyTitle(){
		 
		  //why we should use the headless browser
		 
		 //headless browser does not support everything like the normal browser,it is little bit faster compare to other browser
		 
		   //It is used to create the test date and provide content from one page to other page.This broser will un internally
		 
		   WebDriver driver=new HtmlUnitDriver(true);
		   
		   
		   driver.get("https://accounts.google.com");
		   
		   System.out.println(driver.getTitle());
		   
		   String title=driver.getTitle();
		   
		   Assert.assertTrue(title.contains("Google"));
		  
	 }

}
