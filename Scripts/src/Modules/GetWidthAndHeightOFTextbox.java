package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWidthAndHeightOFTextbox {
	
	@Test
	  public void widthandheight(){
		  
		            
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://accounts.google.com");
		   
		   Point point=driver.findElement(By.id("identifierId")).getLocation();
		  
		   //System.out.println("X Position is " + point.x);
		  
		   //System.out.println("Y Position is " +point.y);
		   
		   int xaxis   =point.x;
		  
		   int yaxis=point.y;
		   
		   Assert.assertEquals(xaxis, yaxis);
	  }

}
