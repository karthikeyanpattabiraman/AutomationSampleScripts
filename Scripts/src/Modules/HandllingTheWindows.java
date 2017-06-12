package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandllingTheWindows {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://accounts.google.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebDriverWait wait=new WebDriverWait(driver, 40);
		 
		WebElement link =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")));
		
		link.click();
		 
		 //Actions action = new Actions(driver);
		 
		// action.moveToElement(driver.findElement(By.xpath(".//span[3][@class='content padLeft8']/p/a"))).build().perform();
		 
		 //driver.findElement(By.xpath(".//span[3][@class='content padLeft8']/p/a']")).click();
		 
		 //get parent window property
		 
		 String parentwindow=driver.getWindowHandle();
		 
		 System.out.println(parentwindow);
		 
		 //get child window property
		 
		  for(String childwindow:driver.getWindowHandles()){
			  
			  System.out.println(childwindow);
			  
			  //select child window
			  
			  driver.switchTo().window(childwindow);
			  
		  }
		  
		  driver.findElement(By.xpath(".//*[@class='gb_b'][@href='https://www.google.com/intl/en/options/']")).click();	
		  Thread.sleep(3000);
		  
		 driver.switchTo().window(parentwindow);
		 
		 Thread.sleep(7000);
		 
		 Actions action = new Actions(driver);
		 
		 //WebElement parentlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='ZFr60d CeoRYc']")));
		 
		 action.moveToElement(driver.findElement(By.xpath(".//content[@class='CwaK9' or @class='RveJvd snByac']"))).build().perform();
		 
		 driver.findElement(By.xpath(".//content[@class='CwaK9' or @class='RveJvd snByac']")).click();
		 
		 //WebElement parentlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='ZFr60d CeoRYc']")));
		 
		 //parentlink.click();
		 
		 
   }
}
