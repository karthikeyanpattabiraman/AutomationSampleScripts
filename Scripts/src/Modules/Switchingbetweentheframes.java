package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingbetweentheframes {
	
   public static void main(String[] args) throws InterruptedException{
	
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	   
	     driver.manage().window().maximize();
	     
	     Thread.sleep(3000);
	   
	   // String url=driver.getCurrentUrl(); to get the current url
	    
	   // System.out.println(url);it will print the url
	     
	       driver.switchTo().frame("classFrame");//switching to the frame by name  "classFrame" is the name by inspecting
	       
	       Thread.sleep(3000);
	     
	       driver.findElement(By.xpath(".//div[@class='topNav']/ul[@class='navList']/li[contains(.,'Index')]")).click();
	       
	       driver.navigate().refresh();//while switching one frame to another we need to refresh it.
	       
	       driver.switchTo().frame("packageListFrame");
	       
	       Thread.sleep(4000);

	       driver.findElement(By.xpath(".//div[@class='indexContainer']/ul[@title='Packages']/li[1]/a[contains(.,'com.thoughtworks.selenium')]")).click();
   
}
} 
