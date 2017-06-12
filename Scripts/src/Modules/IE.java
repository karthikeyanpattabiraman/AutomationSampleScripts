
package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	   public static void main(String[] args){
		   
		   System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		   
		   WebDriver driver=new InternetExplorerDriver();
		   
		   driver.get("http://localhost:8080/login.do");
	   }
}
