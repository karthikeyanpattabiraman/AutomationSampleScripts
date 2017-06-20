package Modules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AT_DropdowninDealearsPage {
	
	   public  WebDriver driver;
	   
	   @BeforeTest

	    public void setup(){
		   
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://localhost:4200/dealer");

	    }
	   
	   
	   
	       @FindBy(name="state")
	       private WebElement stateDrop;
	      
	      
	      @FindBys({@FindBy(xpath=".//select[@class='input-xlarge box ng-pristine ng-invalid ng-touched']/option")})
	      
	      private List<WebElement> dropstateList;
	      
	   
	   
	  
	   
	   
	    public AT_DropdowninDealearsPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	   
	   public void drop_down(){
		     
		  Select select=new Select(stateDrop);
		  
		  ((WebElement) select).click();
		  
		  select.selectByVisibleText("Asir");
		   
		   
	   }
	   
	   
	 @Test
	 
	   public void verifydropdown(){
		 
		 AT_DropdowninDealearsPage at =new  AT_DropdowninDealearsPage(driver);
		 
		 at.drop_down();
		 
		 
	 }
	  

}

