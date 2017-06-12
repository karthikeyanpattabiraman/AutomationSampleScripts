package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByview {
	
	@Test
	public void srolling() throws InterruptedException{
		
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://news.google.co.in/");
		   
		   Thread.sleep(7000);
		   
		   JavascriptExecutor je=(JavascriptExecutor)driver;
		   
		   WebElement element=driver.findElement(By.xpath(".//*[@id='MAA4AkgAUABgAWoCaW4']/span[text()='Macron headed for overwhelming parliamentary majority']"));
		   
		   je.executeScript("arguments[0].scrollIntoView(true);", element);
		   
		   element.click();
		      
	}

} 
