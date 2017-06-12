package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	   public static void main(String[] args){
		   
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://accounts.google.com");
		   
		   driver.findElement(By.id("identifierId")).sendKeys("karthidk20");
		   
		   driver.findElement(By.id("identifierNext")).click();
		   
		   driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("karthiknd");
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.findElement(By.id("passwordNext")).click();
		   
		   driver.findElement(By.id("gbwa")).click();
		   
		   driver.findElement(By.id("gb23")).click();
	   }
	   
}
