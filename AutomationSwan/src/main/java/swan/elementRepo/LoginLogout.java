package swan.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogout 
{
         

	public LoginLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    
	}
	
	// Login 
//	WebElement Loginemail = driver.findElement(By.xpath("//input[@id='email']"));
	@FindBy(xpath="//input[@id='email']") 
	WebElement Loginemail;
	
	
//	WebElement Loginpass = driver.findElement(By.id("Pass"));
	@FindBy(id="pass")
	WebElement Loginpass;
	
//	WebElement clickonLogin = driver.findElement(By.xpath("//button[@id='btn']"));
	@FindBy(xpath="//button[@id='btn']")
	WebElement clickonLoginbtn;
	
	
	//Logout
         
	    //click on user email
		@FindBy(xpath="//i[@nztype='user']/..//span")
		WebElement Clickemail;
		
		// click on logout button 
		@FindBy(xpath="//span[text()='Logout']")
		WebElement ClickLogout;
	   
	
	public  void Loginapp(String email,String password) throws InterruptedException
	{  
		

		Loginemail.sendKeys(email);                          
		Loginpass.sendKeys(password);      
		clickonLoginbtn.click();
		Thread.sleep(5000);
		
	}
	
	public void LogoutS() throws InterruptedException 
	
	{

	   Thread.sleep(5000);
	   Clickemail.click();
	   Thread.sleep(2000);
	   ClickLogout.click();
	   Thread.sleep(2000);
			
	}

	        
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

