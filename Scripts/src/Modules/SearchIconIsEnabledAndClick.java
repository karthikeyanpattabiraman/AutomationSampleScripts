package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIconIsEnabledAndClick {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://support.google.com/accounts?hl=en#topic=3382296");
		   
		   driver.findElement(By.xpath(".//input[@class='gb_Be']")).sendKeys("karthidk20");
		   
		   //verify the "search icon is displayed and print"
		   
		   boolean searchiconpresence=driver.findElement(By.xpath(".//button[@class='gb_De' or @xmlns='http://www.w3.org/2000/svg']")).isDisplayed();
		   
		   System.out.println(searchiconpresence);
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   //verify the "search icon is enabled and print"
		   
		   boolean searchienabled=driver.findElement(By.xpath(".//button[@class='gb_De' or @xmlns='http://www.w3.org/2000/svg']")).isEnabled();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   System.out.println(searchienabled);
		   
		   if(searchiconpresence==true && searchienabled==true){
			   
			   //clicking the search icon
			   
			   WebElement icon=driver.findElement(By.xpath(".//button[@class='gb_De' or @xmlns='http://www.w3.org/2000/svg']"));
			   
			   icon.click();
		   }

	}

}
