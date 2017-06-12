package Modules;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTheErrorMessage {
	@Test
	 public void verifyError(){
		 
		   
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://accounts.google.com");
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath("//content[@class='CwaK9' or @text()='Next']")).click();
		   
		   driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		   
		   //1st by getting through text()
		   String actual=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		   
		   String exp="Enter an email or phone number";
		   
		   Assert.assertEquals(actual,exp);
		   
		   //Assert.assertTrue(actual.contains("Enter an email or phone number"));
		   
		   //by this two ways we can do it.
		   
		   //getting through attribute
		   
           String actualattribute=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
		   
		   String expattribute="Enter an email or phone number";
		   
		   Assert.assertEquals(actual,exp);
		 
		 
	 }

}
