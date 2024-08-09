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
		
		Loginemail.sendKeys(email);                          
		Loginpass.sendKeys(password);      
		clickonLoginbtn.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
