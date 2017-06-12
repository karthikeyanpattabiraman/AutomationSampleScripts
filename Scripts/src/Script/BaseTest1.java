package Script;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	@Parameters("Browser")
	public  void test1(String browser) {
	 
	if(browser.equalsIgnoreCase("FF")){
	 
	 driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	 
	}
	else if(browser.equalsIgnoreCase("IE")){
	 
	System.setProperty("webdriver.ie.driver", "./server/IEDriverServer.exe");
	 
	 driver=new InternetExplorerDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	
	}
	
	else if(browser.equalsIgnoreCase("crome")){
		
		  ChromeOptions options = new ChromeOptions();
		  
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  
		  prefs.put("credentials_enable_service", false);
		  
		  prefs.put("profile.password_manager_enabled", false);

		  options.setExperimentalOption("prefs", prefs);
		  
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  
		  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
	      driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://localhost:8080/login.do");
		 
		
		}
	}
	 
	
	

}
