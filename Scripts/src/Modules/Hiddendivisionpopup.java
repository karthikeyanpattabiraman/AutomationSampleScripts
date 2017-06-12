package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup {
	
	
	  public static void main(String[] args) throws InterruptedException{
		  
		    
		   
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		     
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.yatra.com/");
			 
			 driver.findElement(By.id("BE_flight_depart_date")).click();
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath(".//*[@id='a_2017_6_9']/span")).click();
			 
			 
		  
		     
		  
		  
	  }
	
}
