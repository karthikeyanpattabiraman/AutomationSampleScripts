package Modules;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheBrokenLink {
	
	public static void main(String[] args) throws InterruptedException{
		

		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	     
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.co.in");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		 
		 System.out.println("total links are " + allLinks.size());
		 
		 for(int i=0;i<allLinks.size();i++){
			 
			       WebElement ele=allLinks.get(i);
			       
			       String url=ele.getAttribute("href");
			       
			       VeriyActiveLink(url);
			       
			       
		 }
		 
}

	public static void VeriyActiveLink(String linkurl){
		
		try{
			  URL url=new URL(linkurl);
			  
			  HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			  
			  httpURLConnect.setConnectTimeout(3000); 
			  
			  if(httpURLConnect.getResponseCode()==200){
				  
				  System.out.println(linkurl + " " + httpURLConnect.getResponseMessage());
			  }
			  if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				  
				  System.out.println(linkurl + " " + httpURLConnect.getResponseMessage()+ " " + HttpURLConnection.HTTP_NOT_FOUND);
			  }
			
		}
		
		catch(Exception e){
			
			
		}
		
		  
	}
	

}
