package pageobject;
                                                    //From video no 158 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class  LoginLogout extends ReusableComponents

{
	     public  WebDriver driver;
	
	
	
	public LoginLogout(WebDriver driver)      // constructor  - we are creating a constructor because 
	                                             // to use this.driver , to take the driver properties from another methos 
	{   super(driver);                                          // The web driver used in Line 17 is coming form calss Frameworkexecution  we need to create an object of current class there 
		this.driver=driver;
		PageFactory.initElements(driver, this);   // This is to execute before all below created mwthods / to give driver knowledge to methods 
	}
	
	public  void Landingpage(String Landingpage)
	{
		driver.get(Landingpage);
		
	}
	
	// Login 
//	WebElement Loginemail = driver.findElement(By.xpath("//input[@id='email']"));
	@FindBy(xpath="//input[@id='email']")   //this is page factory Model ///// 
	WebElement Loginemail;
	
	
//	WebElement Loginpass = driver.findElement(By.id("Pass"));
	@FindBy(id="pass")
	WebElement Loginpass;
	
//	WebElement clickonLogin = driver.findElement(By.xpath("//button[@id='btn']"));
	@FindBy(xpath="//button[@id='btn']")
	WebElement clickonLoginbtn;
	
	public  void Loginapp(String email,String password) throws InterruptedException
	{  
		
		Loginemail.sendKeys(email);           //Using page factory models in methods and then we can call then in another classes //// 
		Loginpass.sendKeys(password);      
		clickonLoginbtn.click();
		Thread.sleep(5000);
	}
	
	
	// Logout 
	@FindBy(xpath="//i[@nztype='user']/..//span")
	WebElement Clickemail;
	
	// click on logout button 
	@FindBy(xpath="//span[text()='Logout']")
	WebElement ClickLogout;
   
	public void Logoutofapp() throws InterruptedException
	{  
		Thread.sleep(5000);
	   Clickemail.click();
	   Thread.sleep(2000);
	   ClickLogout.click();
	   Thread.sleep(2000);
	}
	
	public void launchbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\AutomationNotes\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
}
