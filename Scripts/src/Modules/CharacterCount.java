package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CharacterCount {

	public static void main(String[] args) {
	
		
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://accounts.google.com");
		   
		   int expcount=127;
		   
		   
		   
		   for(int i=0;i<=127;i++){
			   
			   
		          driver.findElement(By.id("identifierId")).sendKeys("a");
		          
		          System.out.println(i);
		          
		          
		   }
		          
		          /* WebElement actualcount=driver.findElement(By.id("identifierId"));
		          
		          if(actualcount.equals(expcount)){
		        	  
		        	    System.out.println("the counnt is 128");
		          }
		          else{
		        	  
		        	  System.out.println("less than 128");
		          }*/
		        	          }
		   
		      //nt expcount=driver.findElement(By.id("identifierId")).getText().lastIndexOf(i);
	          
	          //Assert.assertEquals(expcount, actualcount);	

	}


