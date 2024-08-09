package swan.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import swan.genericlib.BaseClass;

public class LogIntoSwan extends BaseClass 
{
   

	@Test
	public void LoginSwan() throws InterruptedException, IOException 
	{	
		// While running this test keep in mid of before method and after method//
		 LaunchBrowser();                             
		 LandingPage();                                  
		 Loggingin();                                 
		                                                                     
	}
	
	
	
	                                             
}
