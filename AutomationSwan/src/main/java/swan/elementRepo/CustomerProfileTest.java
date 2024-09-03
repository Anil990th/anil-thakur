package swan.elementRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerProfileTest {

    WebDriver driver;
	public   CustomerProfileTest (WebDriver driver)throws InterruptedException
	{   
		this.driver=driver;     
		PageFactory.initElements(driver,this); 
	}
		
		
		@FindBy(xpath="//span[text()='Customer Profile']")
		WebElement ClockOnCustomerProfile;
		
		@FindBy(xpath="//input[contains(@placeholder,'Phone Number')]")
		WebElement Enteremailaddress;

		@FindBy(xpath="(//button[contains(@class,'ant-btn-icon-only')])[1]")
		WebElement clickeyebutton;
		
        @FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
        WebElement clickviewcustomerdetails;
        
        
        @FindBy(xpath="//div[@class='ant-tabs-tab ng-star-inserted'][1]")
        WebElement clicko1;

         @FindBy(xpath="//div[@class='ant-tabs-tab ng-star-inserted'][2]")
         WebElement clicko2;


          @FindBy(xpath="//div[@class='ant-tabs-tab ng-star-inserted'][3]")
          WebElement clicko3;

          @FindBy(xpath="//div[@class='ant-tabs-tab ng-star-inserted'][4]")
          WebElement Clicko4;
          
          @FindBy(xpath="//div[@class='ant-tabs-tab ng-star-inserted'][5]")
          WebElement clicko5;
          
          @FindBy(xpath="//button[@id='detailsDrawerClose']") 
          WebElement clicko6;
          
     
	
	public void RegisteredProfileTest(String email) throws InterruptedException  
	{
		ClockOnCustomerProfile.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[contains(@placeholder,'Phone Number')]"))).perform();
		Enteremailaddress.sendKeys(email);  
		Thread.sleep(2000);
		clickeyebutton.click();
		Thread.sleep(2500);
		clickviewcustomerdetails.click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][1]"))).build().perform();
		Thread.sleep(2500);
		clicko1.click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][2]"))).build().perform();
		Thread.sleep(2500);
		clicko2.click();
	    Thread.sleep(1500);
	    act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();////
        Thread.sleep(1500);
        act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][3]"))).build().perform();
		Thread.sleep(1500);
		clicko3.click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][4]"))).build().perform();
		Thread.sleep(1000);
		Clicko4.click();
		Thread.sleep(3000);

		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][5]"))).build().perform();
		Thread.sleep(1500);
		clicko5.click();
		Thread.sleep(1500);
		clicko6.click();
		
	}  


}
