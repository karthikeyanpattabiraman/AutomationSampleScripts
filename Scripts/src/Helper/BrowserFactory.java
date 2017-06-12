package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;

import Screenshotcapture.Utility;

public class BrowserFactory {
	
      static WebDriver driver;
	   
	   public BrowserFactory(WebDriver driver){
		   
		   this.driver=driver;
		   
		   PageFactory.initElements(driver,this);
	   }
	   

	
	    public static WebDriver startBrowser(String browserName, String url)
	    {
	    	
	    	if(browserName.equalsIgnoreCase("chrome")){
	    		
	    		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    		
	    		driver=new ChromeDriver();
	    		
	    	}
	    	
	    	else if(browserName.equalsIgnoreCase("IE")){
	    		
	    		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
	    		
	    		  driver = new InternetExplorerDriver();
	    		
	    	}
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.get(url);
	    	
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  	
	    	
	    	return driver;
	    }
	    	
	    	 public static String  verifyTitle(String eTitle){
		    	   
		    	   String aTitle = driver.getTitle();
		    	   
		    	   Assert.assertEquals(aTitle,eTitle);
		    	   
				return aTitle;
		    	   
		    	   
		       } 
	   
	 
	   
	    /*public static void tearDown(ITestResult result){
	    	 
	    	 
	    	  if(ITestResult.FAILURE==result.getStatus()){
	    		  
	    		  
	    		  Utility.captureScreenshot(driver,result.getName());
	    	  }
	    	  
	    	  
	    	  
	    	 
	           
	    	}*/
}
