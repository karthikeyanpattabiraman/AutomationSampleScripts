package Modules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingCheckboxInTheAlert {
	
	 @Test
	 
	  public void checkboxinalert() throws InterruptedException{
		 
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

	         WebDriver driver = new ChromeDriver();
	         
	         driver.manage().window().maximize();

	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         
	         
	         driver.get("http://investors.covanta.com/Investor-Relations/default.aspx");
	         
	          //JavascriptExecutor je=(JavascriptExecutor)driver;
			   
			  WebElement element=driver.findElement(By.xpath(".//div[@class='subscribe-button' and contains(.,'Subscribe')]"));
			   
			   //je.executeScript("arguments[0].scrollIntoView(true);", element);
			   
			   element.click();
			   
			   Thread.sleep(3000);
			   
			   //driver.switchTo().alert();
			   
			   List<WebElement> chk=driver.findElements(By.xpath(".//input[@type='checkbox']"));
			   
			   for(int i=0;i<chk.size();i++){
				   
				       WebElement chkele=chk.get(i);
				       
				       String text=chkele.getAttribute("label");
				       
				       //String text=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML",chkele);;
				       
				         if(text.equalsIgnoreCase("News/Press Release")){
				        	 
				        	 Actions action=new Actions(driver);
				        	 
				        	action.moveToElement(chkele).build().perform();
				        	 
				        	   chkele.click();
				        	   
				        	   break;
				         }
			   }
	 }

}
