package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	
	  public static void main(String[] args) throws InterruptedException{
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("loginbutton")).click();
			
			String Text=driver.switchTo().alert().getText();
			
			System.out.println(Text);
			
			if(Text.contentEquals("Enter User ID")){
				
				  driver.switchTo().alert().accept();
				
			}
			
			else{
				
				System.out.println("Invalid alert");
				
			}
			
			
	  }

}
