package Actions_Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {
	
	
	public static void clickByID(WebDriver driver,String lid){
	
	
	  Actions actions = new Actions(driver);
	  
	  actions.moveToElement(driver.findElement(By.id(lid))).build().perform();
	  
	  driver.findElement(By.id(lid)).click();
	}
	  
	
	public static void clickByLinkText(WebDriver driver,String text){
		
		  Actions actions = new Actions(driver);
		  
		  actions.moveToElement(driver.findElement(By.linkText(text))).build().perform();
		  
		  driver.findElement(By.linkText(text)).click();
		  
		  //driver files sampl
		
		
	}
	 
	  public static void clickByXpath(WebDriver driver,String lxpath){
			
			
		  Actions actions = new Actions(driver);
		  
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).click().build().perform();
		  //actions.clickAndHold().moveToElement(driver.findElement(By.xpath(lxpath))).release().build().perform();
		  //actions.clickAndHold().moveToElement(driver.findElement(By.xpath(lxpath))).click().build().perform();
		  
		  //actions.clickAndHold().moveToElement(driver.findElement(By.xpath(lxpath))).build().perform();
		  
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).release().perform();
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).release().perform();//
		  
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).click().perform();
		  
		  
		    actions.moveToElement(driver.findElement(By.xpath(lxpath))).click().build().perform();
		  
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).doubleClick().build().perform();
		  
		  //actions.moveToElement(driver.findElement(By.xpath(lxpath))).contextClick(driver.findElement(By.xpath(lxpath))).build().perform();
		  
		 
	  
	}
}
