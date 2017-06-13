package Script;

import org.testng.annotations.Test;

import Screenshotcapture.Utility;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;
import pom.ViewTimeTrackPage;

public class ValidLogin extends BaseTest {
	

	@Test(groups={"ValidLogin.testValidLogin"})
	  
	    public void testValidLogin() throws InterruptedException{
		  
		  String un=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin",1,0);
		  
		  String pw=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin",1,1);
		  
		  String hp=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin", 1,2);
		  
		  String lp=Excel.getCellValue(AutomationConstant.XL_PATH,"ValidLogin", 1,3);
		  
		  LoginPage l =new LoginPage(driver);
		  
		  l.setUserName(un);
		  
		  l.setPwd(pw);
		  
		  l.clickLoginButton();
		  
		  
		  EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		  
		  
		  
		  //e.verifyTitle(hp);
		  
		   //e.Datepicker();
		  
		  //e.handleDropdown();
		  
		  //e.clickLogout();
		  
		  
		   
		  // ViewTimeTrackPage v=new ViewTimeTrackPage(driver);
		   
		  // v.Currentmonthdropdown();
	  }
}
