package swan.elementRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import swan.genericlib.BaseClass;


public class CustomerRegistration extends BaseClass
{
    WebDriver driver;
	public CustomerRegistration(WebDriver driver) 
	
	{   
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
WebElement dropdown;


// Select country code 
@FindBy(xpath="(//li[@unselectable='unselectable'])[177]")
WebElement Countrycode; 

// Enter Phone  number.
@FindBy(xpath="//input[@formcontrolname='mobile']")
WebElement phoneno;

//click on date of birth 
@FindBy(xpath="//input[contains(@placeholder,'date')]")
WebElement clickondateofbirth;

// select date form the calender
@FindBy(xpath="(//div[text()=' 10 '])[1]")
WebElement selectdateofbirthfromcalender;

//click on nationality dropdown
@FindBy(xpath="//div[contains(text(),'Nationality')]")
WebElement clicknationalitydropdoiwn;

//Select country from the dropdown
@FindBy(xpath="(//li[@unselectable='unselectable'])[9]")
WebElement selectthecountry;

//click on gender dropdown
@FindBy(xpath="//div[text()='Please select your Gender']")
WebElement clickgenderdropdown;

//select gender from the dropdown
@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")
WebElement selectgender;

//click on language dropdwon    
@FindBy(xpath="/div[text()='Please select your Language']")    //"//div[text()='Please select your Language']"
WebElement clicklanguagedropdwon;

// Select language from the dropdown
@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][7]")
WebElement selectlanguage;

//ENter value on address column
@FindBy(xpath="(//input[@Placeholder='Please enter value'])[1]")
WebElement enteraddress;

//click on energency dropdwon
@FindBy(xpath="//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")
WebElement emergencydropdownclick;

//Enter Value in the emergency dropdwon
@FindBy(xpath="//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")
WebElement enteremergencyvalue;

//click on join bispro dropdwon
@FindBy(xpath="//div[text()='Please select your option']")
WebElement clickjoinbisprodropdown;

//selecy value from join bispro dropdown
@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")
WebElement selectvalueofjoinbispro;

//click on join programme
@FindBy(xpath="(//div[(contains(@class,'ant-select-selection__rendered'))])[6]")
WebElement clickjoinprogramme;

//select value from join programme
@FindBy(xpath="(//li[@unselectable='unselectable'])[1")
WebElement selectvaluefromjoinprogramme;

//Entervalue in my fields column
@FindBy(xpath="(//input[@Placeholder='Please enter value'])[2]")
WebElement entervalueinmyfield;

//Enter value in other column
@FindBy(xpath="(//input[@Placeholder='Please enter value'])[3]")
WebElement entervalueinothercolumn;

//click on whats app preferences
@FindBy(xpath="(//nz-button-group[contains(@class,'preferences ant-btn-group')])[4]//button[1]")
WebElement selectwhatsapppreferences;


// click on register 
@FindBy(xpath="//button[@class='register-btn pull-right ant-btn ng-star-inserted ant-btn-default']")
WebElement Registerbuttonclick;

@FindBy(xpath="//div[contains(@class,'ant-notification-notice-message')]") ////////////////////////////////
WebElement error;              
        

public void Customerregistration(String firstname, String email,String enterphoneno ,String emergencyno) throws InterruptedException

{
 Thread.sleep(4000); 
Clickoncustomerprofiletab.click();
Thread.sleep(4000);
customerregisterclick.click();
entername.sendKeys(firstname);
emailaddress.sendKeys(email);
dropdown.click();
Thread.sleep(2000);
Countrycode.click();
phoneno.sendKeys(enterphoneno);

clickondateofbirth.click();
selectdateofbirthfromcalender.click();
clicknationalitydropdoiwn.click();
selectthecountry.click();
clickgenderdropdown.click();
Thread.sleep(2000);
selectgender.click();
//Thread.sleep(5000);  
//clicklanguagedropdwon.click();     //   element click intercepted error 
//Thread.sleep(2000);
//selectlanguage.click();
enteraddress.sendKeys("Bangalore");;
emergencydropdownclick.click();
enteremergencyvalue.sendKeys(emergencyno);
clickjoinbisprodropdown.click();
selectvalueofjoinbispro.click();
//clickjoinprogramme.click();
//Thread.sleep(2000);
//selectvaluefromjoinprogramme.click();  //element click intercepted  line no 157 connected to this.
entervalueinmyfield.sendKeys("XYZ");;
entervalueinothercolumn.sendKeys("Loyalytics Saudi Arabias");
selectwhatsapppreferences.click();
Registerbuttonclick.click();
String text = error.getText();
System.out.println(text);    
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'ant-notification-notice-message')]")).getText(),"Successfully Registered.");

}
	
	
	








}
