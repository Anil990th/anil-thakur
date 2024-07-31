package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Miscellenousjava {
    
	@Test
	public static void justtakealook()
	{     
		
		 EdgeOptions options = new EdgeOptions();  // Without this step if you invoke a url which has privacy or not http then it will not work ///
		 options.setAcceptInsecureCerts(true);

	     WebDriver driver = new EdgeDriver(options);
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();              // deleting the cookies
	     driver.get("https://expired.badssl.com/");
	     System.out.println(driver.getTitle());     // failed to get the title if options class is not used  security/privacy reasons
                                                   // How to overcome that by using Options class as shown in the code ///
	     
	     
	     ////// Hpw to add extensions ////
	     
	            // pou need to watch video no 105 for this ////
	     
	     
	     
	     
	     Assert.assertTrue(false); // this line is for test 
	    
	     
	}

}
