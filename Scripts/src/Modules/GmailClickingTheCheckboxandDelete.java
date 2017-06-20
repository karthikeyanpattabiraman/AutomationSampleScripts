package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailClickingTheCheckboxandDelete {
	
	
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
		   
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
		   Actions actions = new Actions(driver);
			  
		   actions.moveToElement(driver.findElement(By.cssSelector("div[id=':36'][role='checkbox']"))).build().perform();
		   
		    driver.findElement(By.cssSelector("div[id=':36'][role='checkbox']")).click();
		   
		   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath(".//div[@class='asa']/div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
		   
		  

    }

}