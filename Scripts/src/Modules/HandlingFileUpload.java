package Modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingFileUpload {
	
	  @Test
	  
	   public void FileUpload() throws AWTException{
		  
		     Robot robot=new Robot();
		  
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		     
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("http://demo.automationtesting.in/Register.html");
			 
			 driver.manage().window().maximize();
			 
			 WebDriverWait wait=new WebDriverWait(driver, 40);
			 
			 WebElement link =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imagesrc")));
		  
		     link.click();
		     
		     robot.setAutoDelay(2000);
		  
		     StringSelection stringSelection=new StringSelection("C:\\Users\\karthikeyanp\\Documents\\interaction.docx");
		     
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		     
		     robot.setAutoDelay(2000);
		     
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     
		     robot.keyPress(KeyEvent.VK_V);
		     
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     
		     robot.keyRelease(KeyEvent.VK_V);
		     
		     robot.setAutoDelay(2000);
		     
		     robot.keyPress(KeyEvent.VK_ENTER);
		     
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     
		     
		     
		     
	  }
	  
	  

}
