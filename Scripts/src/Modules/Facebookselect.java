package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookselect {
	
	 public static void main(String[] args) throws InterruptedException{
		 
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 WebElement month_drop=driver.findElement(By.id("month"));
		 
		 Select month_dd = new Select(month_drop);
		 
		 month_drop.click();
		 
		 Thread.sleep(2000);
		 
		 String exp = "Aug";
		 
		 List<WebElement> monthlist=month_dd.getOptions();
		 
		 int total=monthlist.size();
		 
		 for(WebElement ele: monthlist){
			 
			   String actmonth=ele.getText();
			 
			   if(exp.equals(actmonth)){
				   
				     ele.click();
			   }
		 }
		 
		 
		/* //month_dd.selectByIndex(1);
		 Thread.sleep(2000);
		 
		 month_drop.click();
		 
		 Thread.sleep(2000);
		 
		 month_dd.selectByVisibleText("Feb");*/
		 
		 
		 
		 
	 }

}
