package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerMonthSelect {
	
	public static void main(String[] args) throws InterruptedException{
		
		
	String Expmonth = "March 2018";
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/login.do");
	Thread.sleep(3000);
	
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("ext-gen23")).click();
	Thread.sleep(3000);
	
	
	String currmonth=driver.findElement(By.xpath(".//button[@class='x-btn-text'][@id='ext-gen23']")).getText();
	
	if(Expmonth.equals(currmonth)){
		
		
	}
	
	else{
		
		for(int i=1;i<10;i++){
			
			driver.findElement(By.id("ext-gen48")).click();
			
			Thread.sleep(3000);
			
			 currmonth=driver.findElement(By.xpath(".//button[@class='x-btn-text'][@id='ext-gen23']")).getText();
			 
			 if(Expmonth.equals(currmonth)){
				 
				 break;
			 }
			
		}
		
	}
	
	  
	  
	}
}
