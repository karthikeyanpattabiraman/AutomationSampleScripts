package Script;

import org.testng.annotations.Test;

import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class TestCaseTocliick extends BaseTest{
	
	


	@Test(priority=2,dependsOnGroups={"ValidLogin.testValidLogin"})
	
	public void clicksettings() throws InterruptedException{
		
		String un=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin",1,0);
		  
		  String pw=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin",1,1);
		  
		  String hp=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin", 1,2);
		  
		  String lp=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin", 1,3);
		
		
		
		LoginPage l =new LoginPage(driver);
		
        l.setUserName(un);
       
        l.setPwd(pw);
        l.clickLoginButton();
	
		
	
		
		Thread.sleep(3000);
		
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		Thread.sleep(3000);
		
		e.SettingClickinng();
		
		
	}
	
	 

}
