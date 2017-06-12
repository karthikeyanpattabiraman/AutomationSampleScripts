package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.testng.annotations.Test;
public class demo {
	
	//@Test(priority=2)
	public static void login(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.quit();
	}
	

}
