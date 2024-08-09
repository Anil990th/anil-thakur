package swan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageobject.CustomerRegistration;
import pageobject.LoginLogout;

public class RegisterCustomer extends LoginLogout {
	
public RegisterCustomer(WebDriver driver)
    {
		super(driver);
	
	}


public static void main(String[] args) throws InterruptedException 
  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\AutomationNotes\\driversfolder\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	RegisterCustomer R = new RegisterCustomer(driver);
	 R.implicitwait(10);
	 
	
	// Landing page / website   
	R.Landingpage("https://qa.swan.cx/app/setup");
	
	// Login
	R.Loginapp("anil.thakur@loyalytics.in","Anil#@1999");
	
	// Registering customer
	CustomerRegistration C = new CustomerRegistration(driver);
	C.Customerregistration("test","at966@gmail.com","809394799089");
	
	// Logoutz
	R.Logoutofapp();
	
	// close browser
	driver.close();

}
}
