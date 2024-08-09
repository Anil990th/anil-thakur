package swan.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import swan.elementRepo.LoginLogout;

public class BaseClass 
{
    public WebDriver driver;
    
    @BeforeMethod(alwaysRun=true)     // why we give always run = true because when you run specific test using grouping then this will create conflit thats why
    public void LaunchBrowser() throws InterruptedException, IOException 
    {    
    	
    	Properties prop = new Properties();
	    FileInputStream fil = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\AutomationSwan\\src\\test\\resources\\GlobalData.properties");
	    prop.load(fil);
	    String browserName = prop.getProperty("browser");
    	
    	if(browserName.equalsIgnoreCase("chrome"))
    	{
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\AutomationSwan\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		LandingPage();
	    Loggingin();	
    	}
    	
    	else if (browserName.equalsIgnoreCase("Edge")) 
    	{
    		
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
    		LandingPage();
    	    Loggingin();
    	}
    	else if (browserName.equalsIgnoreCase("firefox"))
    	{
    		
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    		LandingPage();
    	    Loggingin();
    	}
    		
    	
    }
    
    public void LandingPage() 
    {
    	driver.get("https://qa.swan.cx/app/setup");
    }
    
     
	public  void Loggingin() throws InterruptedException
	{   
		
		LoginLogout L = new LoginLogout(driver);
		L.Loginapp("at96845@gmail.com","Anil#@25");
			
	}
	
	@AfterMethod(alwaysRun=true)    
	public void Logoutuser() throws InterruptedException
	
	{
		
		LoginLogout L2 = new LoginLogout(driver);
		L2.LogoutS();
		driver.close();
		
	}
	
	
	
	
	public  void implicitwait(int timeseconds)
	  {
		driver.manage().timeouts().implicitlyWait(timeseconds,TimeUnit.SECONDS);

	  }	


	public void waitForElementToAppear(By element)
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}

	public void WaitForElementToDissapear(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
