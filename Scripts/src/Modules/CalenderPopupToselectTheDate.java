package Modules;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopupToselectTheDate {
	
	
	 public static void main(String[] args) throws InterruptedException{
		 
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("hp-widget__depart")).click();
		 
		 Thread.sleep(3000);
		 String expdate="13-June-2017";
		 
		 
		 String splitter[]=expdate.split("-");
		 
		 String month_year=splitter[1];
		 
		 String day=splitter[0];
		 
		 //String year="2017";
		 
		 System.out.println(month_year);
		 
		 System.out.println(day);
		 
		 Thread.sleep(3000);
		 
		 //System.out.println(year);
		 
		 //driver.findElement(By.id(".//*[@id='dp1496985247492']")).isDisplayed();
		 
		  List<WebElement> elements=driver.findElements(By.xpath(".//*[@id='dp1496985247492']/div/div[1]/table/tbody/tr/td"));
		  
		  for(int i=0;i<elements.size();i++){
			  
			  if(elements.get(i).getText().equals(month_year)){
				  
				     for(WebElement d:elements){
				    	 
				    	 if(d.getText().equals(day)){
				    		 
				    		 d.click();
				    		 return;
				    		 
				    	 }
				    	 
				    	 
				     }
			  }
		  }
		  
		  
		 
		 Thread.sleep(4000);
		 
		 /*while(true){
			 try{
				    driver.findElement(By.xpath(".//*[@id='dp1496927030525']/div/div[2]/div/div/span[1]")).isDisplayed();
				    Thread.sleep(4000);
				    
				    driver.findElement(By.xpath(".//*[@id='dp1496927030525']/div/div[1]/div/div/span[2]")).isDisplayed();
				    Thread.sleep(4000);
				    
				    driver.findElement(By.xpath(".//*[@id='dp1496985247492']/div/div[1]/table/tbody/tr[3]/td[4]/a")).click();
				    
				    Thread.sleep(5000);
				    
				    break;
				 
				 
			 }
			 
			 catch(Exception e){
				 
				 Thread.sleep(5000);
				 
				 Actions action=new Actions(driver);
				 
				 Thread.sleep(5000);
				 
				 driver.findElement(By.id("js-filterOptins"));
				 
				 action.moveToElement(driver.findElement(By.xpath("(.//span[@class='ui-icon ui-icon-circle-triangle-e' and contains(text(),'Next')])[1]"))).click();
				 
				      
				 //driver.findElement(By.xpath(".//*[@id='dp1496927030525']/div/div[2]/div/a/span")).click();
				 
				 //driver.findElement(By.xpath(".//*[@id='dp1496927030525']/div/div[2]/div/div/span[1]"));
				 
				 //driver.findElement(By.xpath(".//*[@id='dp1496927030525']/div/div[2]/div/div/span[2]"));
				 //Thread.sleep(2000);
				 
			 }
			 
		 }*/
		 
	 }

}
