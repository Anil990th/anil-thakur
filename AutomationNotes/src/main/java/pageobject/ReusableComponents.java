package pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.LoginLogout;

public class ReusableComponents {

   WebDriver driver;
  public ReusableComponents(WebDriver driver)  // constructor to catch super method which is there in fworkcregiustration super keyword 
  {
	    
		this.driver=driver;
  }
  
  public void WebBrowserTrigger()    // Unable to use this method as of now 
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\\\hp\\eclipse-workspace\\AutomationNotes\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://qa.swan.cx/app/setup");
  }
  
  
  
@SuppressWarnings("deprecation")
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



