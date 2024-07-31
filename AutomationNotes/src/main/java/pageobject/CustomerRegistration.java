package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomerRegistration extends ReusableComponents
{
	WebDriver driver;
	public CustomerRegistration(WebDriver driver) 
	
	{   
		super(driver);          // this is to give driver knowledge to reusable component class-- extends required to do this 
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}
	
	// customer registration 
	
    // click on customer profile 
@FindBy(xpath="//span[text()='Customer Profile']")
WebElement Clickoncustomerprofiletab;

// click on register customer 
@FindBy(xpath="//button[@class='ant-btn ng-star-inserted ant-btn-default']")
WebElement customerregisterclick;

// fill first name , Last name and email address.
@FindBy(xpath="//input[@formcontrolname='firstName']")
WebElement entername;

// enter email 
@FindBy(xpath="//input[@placeholder='Please enter your email']")
WebElement emailaddress;

//click on country code dropdown.
	@FindBy(xpath="(//div[@unselectable='unselectable'])[1]")
	WebElement eountrycode;
		

@FindBy(xpath="(//div[@unselectable='unselectable'])[1]") 
WebElement dropdown;


// Select country code 
//driver.findElement(By.xpath("(//li[@unselectable='unselectable'])[177]")).click();
@FindBy(xpath="(//li[@unselectable='unselectable'])[177]")
WebElement Countrycode; 

// Enter Phone  number.
@FindBy(xpath="//input[@formcontrolname='mobile']")
WebElement phoneno;

// click on register 
@FindBy(xpath="//button[@class='register-btn pull-right ant-btn ng-star-inserted ant-btn-default']")
WebElement Registerbuttonclick;


public void Customerregistration(String firstname, String email,String enterphoneno) throws InterruptedException

{
implicitwait(10);  // calling method of reusableComponent class because we have used extends.
Clickoncustomerprofiletab.click();
Thread.sleep(4000);
customerregisterclick.click();
entername.sendKeys(firstname);
emailaddress.sendKeys(email);
dropdown.click();
Thread.sleep(2000);
Countrycode.click();
phoneno.sendKeys(enterphoneno);
Registerbuttonclick.click();
Thread.sleep(3000);
System.out.println("Customer registered successfully");
}
	
	
	
	
	


}
