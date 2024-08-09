package pageobject.basemethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeBrowser 

{
	     public WebDriver driver;
    	 public WebDriver LaunchBrowsers() throws IOException 
    	 
    	 {      
    		    Properties prop = new Properties();
    		    FileInputStream fil = new FileInputStream("C:\\Users\\Dell\\Downloads\\Automation\\src\\main\\java\\pageobject\\resources\\GlobalData.properties");
    		    prop.load(fil);
    		   String browserName = prop.getProperty("browser");
    		    
    		   if(browserName.equalsIgnoreCase("chrome"))
    		   {
    		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
    			ChromeOptions options = new ChromeOptions();
    			options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
    			
    		   }
    		   
    		   else if (browserName.equalsIgnoreCase("Edgedriver"))
    		   {
    			    driver = new EdgeDriver(); 
    			   
    		   }
    		   
    		   else if (browserName.equalsIgnoreCase("firefoxdriver"))
    		   {
    			   
    			   driver = new FirefoxDriver();
    			   
    		   }
                
    		   driver.manage().window().maximize();   
    		   return driver;
    		   
    	 }
	
	          public void LaunchingBrowser() throws IOException 
	          {
	        	  
	        	  driver = LaunchBrowsers();
	        	  
	          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}