package swan.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import swan.genericlib.BaseClass;

public class Loginswan extends BaseClass {

	public static void main(String[] args) throws InterruptedException 
	{
	
		 WebDriver driver = new EdgeDriver();
	
		driver.manage().window().maximize();
		
		Loggingin();
					

	}

}
