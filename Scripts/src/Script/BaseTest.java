package Script;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
	
	  public WebDriver driver;
	  
	  public static int browser;
	  
	  @BeforeMethod
	 
	  public void preConditions(){
		  
		
		  
		  for(browser=1;browser<=2;browser++){
			  
			
			  
			  if(browser==1){
				  
				      ChromeOptions options = new ChromeOptions();
					  
					  Map<String, Object> prefs = new HashMap<String, Object>();
					  
					  prefs.put("credentials_enable_service", false);
					  
					  prefs.put("profile.password_manager_enabled", false);

					  options.setExperimentalOption("prefs", prefs);
					  
					  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					  
					  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				  
				  
				  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				  
				  driver = new ChromeDriver(options);
				  
				  driver.manage().window().maximize();
			  }
			  
			 /*else if(browser==2){
				  
				  
				  System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
				  
				  driver = new InternetExplorerDriver();
			  }*/
			  
              driver.get("http://localhost:8080/login.do");
			  
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  
		  }
		  
		  
		  
		 
	  }
	  
	  

}
