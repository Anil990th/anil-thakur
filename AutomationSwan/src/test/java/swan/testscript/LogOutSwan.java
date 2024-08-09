package swan.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import swan.genericlib.BaseClass;

public class LogOutSwan extends BaseClass

{   @Test  
	public void Loggingout() throws InterruptedException, IOException 
	
	{   
	     // While running this test keep in mind of Before method and after methods//
		 LaunchBrowser();                             
		 LandingPage();                                  
		 Loggingin();
		 Logoutuser();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
