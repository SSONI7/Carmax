package Carmax.testcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Carmax.basepage.Registration_Carmax;

@Listeners({ Carmax.util.ScreenshotUtility.class })
public class TC01_Register extends CommonClass {
	
 @Test
 public void Registration_Profile() throws InterruptedException{
	
	  Registration_Carmax carmax = new Registration_Carmax(driver);
	  
	  
	  carmax.open();
	  carmax.Register_User();
	  Thread.sleep(5000);

  }

}
