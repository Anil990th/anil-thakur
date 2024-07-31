package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PageobjectExecution extends ReusableComponents {
	
public PageobjectExecution(WebDriver driver)
{
		super(driver);
		
	}

public  void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	PageobjectExecution R = new PageobjectExecution(driver);
	 R.implicitwait(10);
	 
	LoginLogout L = new  LoginLogout(driver);
	// Landing page / website
	L.Landingpage("https://qa.swan.cx/app/setup");
	
	// Login
	L.Loginapp("anil.thakur@loyalytics.in","Anil#@1999");
	
	// Registering customer
	CustomerRegistration C = new CustomerRegistration(driver);
	C.Customerregistration("Linax","at9867@gmail.com","89629923947");
	
	// Logout
	Thread.sleep(5000);
	L.Logoutofapp();
	Thread.sleep(2000);
	driver.close();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
}
