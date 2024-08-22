package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateCampaign extends LoginLogout {

    WebDriver driver;
	public CreateCampaign(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this); 
		
	}
	        // click create campaign sidebar 
		@FindBy(xpath="//span[text()='Create Campaigns']")
		WebElement createcampaignclick;

		    // click on create campaign button 
		@FindBy(xpath="//button[@class='ant-btn ng-star-inserted ant-btn-primary ant-btn-block']")
		WebElement createcampaignbuttonclick;
		
		// click on name of campaign and send keys 
		@FindBy(css="input[placeholder='name']")
		WebElement nameofcampaign;

		@FindBy(css="div[unselectable='unselectable']")
		WebElement clicksubtype;
		
		// select option from dropdown
		@FindBy(css="li[class='ant-select-dropdown-menu-item ng-star-inserted']:nth-child(1)")
		WebElement selectoption;
		
		// Click and enter coupon code 
		@FindBy(css="input[placeholder='MKT (Optional)']")
		WebElement couponcode;;
		
		// click next button
		@FindBy(css="button[class='next pull-right ant-btn ng-star-inserted ant-btn-default']")
		WebElement clicknextbutton;
		
		// click on date type 
		@FindBy(xpath="//div[text()='Select date Type']")
		WebElement selectdatetype;
		
		// Select option from date type
		@FindBy(css="li[class='ant-select-dropdown-menu-item ng-star-inserted']:nth-child(2)")
		WebElement Selectoption;
	
		// click select dynamic date period dropdown
		@FindBy(xpath="//div[text()='Select Dynamic Date period']")
		WebElement clickdynamicoption;
	
		// select option from dynamic dropdown
		@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")
		WebElement Selectoptionofdynamicddown;

		// Enter start date number 
		@FindBy(id="campaignArray.validFrom")
		WebElement Enterstartdate;
		
		// Enter end date	
		@FindBy(xpath="//input[@formcontrolname='validTo']")
		WebElement Enterenddate;
		
		// click on select all days check box
		@FindBy(xpath="//input[@type='checkbox'][1]")
		WebElement Alldayscheckbox;
		
		// driver.findElement(By.xpath("(//input[@placeholder='Select time'])[1]")).click();
		// click on start time 
		@FindBy(xpath="(//input[@placeholder='Select time'])[1]")
		WebElement clickselectelecttime;
		
		// Select time from select time dropdown
		@FindBy(xpath="(//li[@class='ant-time-picker-panel-select-option-selected ng-star-inserted'])[1]")
		WebElement selectstarttime;
		
		// Click on End time 
		@FindBy(xpath="(//input[@placeholder='Select time'])[2]")
		WebElement clickendtime;
		
		// Select end time 
		@FindBy(xpath="(//li[@class='ant-time-picker-panel-select-option-selected ng-star-inserted'])[2]")
		WebElement selectendtime;
		
		 // click on select all stores check box
		@FindBy(xpath="//input[@formcontrolname='allStores']")
		WebElement selectallstores;
		
		  // click on select all products 
		@FindBy(xpath="//input[@formcontrolname='allProducts']")
		WebElement selectallproducts;
		  
		// click on next button
		@FindBy(xpath="//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")
		WebElement clicnextpagebutton;
		
		 // click on offer type 
		@FindBy(xpath="//nz-select[@formcontrolname='couponType']")
		WebElement clickoffertype;
		
		 // click on percent 
		@FindBy(xpath="//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")
		WebElement clickperecent;
		
		//click and enter discount 
		@FindBy(xpath="//input[@onkeypress='return event.charCode >= 48']")
		WebElement clickandenterdiscount;
		
		 // click and enter threshold
		@FindBy(xpath="//input[@formcontrolname='threshold']")
		WebElement clickandenterthreshold;
		
		 // click and enter max discount 
		@FindBy(xpath="//input[@formcontrolname='maxDiscount']")
		WebElement clickandentermaxdiscount;
		
		  // click on not valid for already discounted items checkbox
		@FindBy(xpath="//input[@formcontrolname='fullPrice']")
		WebElement clickdiscounteditems;
		
		// click on next button
		@FindBy(xpath="//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")
		WebElement clicknexttbutton;
		
		// click on coupon label 
		@FindBy(xpath="//input[@placeholder='Enter Coupon Label']")
        WebElement clickcouponlabel;
		
		// click and enter description
		@FindBy(xpath="//textarea[@nzplaceholder='Enter Campaign Description...']")
		WebElement enterdescription;
		
		 // click and enter Terms and conditions 
		@FindBy(xpath="//textarea[@formcontrolname='termsAndConditions']")
		WebElement clickandenterterms;
		
		// click on next button   
        @FindBy(xpath="//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")
        WebElement clicknextttbutton;
        
        // click on submit button 
        @FindBy(xpath="//button[@class='button pull-right ant-btn ng-star-inserted ant-btn-default']")
        WebElement clicksubmitbutton;
        
        // click on active toggle button 
        @FindBy(xpath="(//button[@class='ant-switch ant-switch-small'])[1]")
		 WebElement clickactive;
        
        // click on on 
        @FindBy(xpath="//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
        WebElement clickonok;
        
 //        By clickOOK = By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-primary']"); eg of how to use by in page factory in waits  see line no 215 also 
     
   //     @FindBy(xpath="//button[@class='ant-btn ng-star-inserted ant-btn-primary']")
   //     WebElement clicks;     // eg of how to use webelement page factory in waits  // see line no 223 also .
        
        
		public void createcampaignf(String campaignname , String entercouponcode, String startdate, String enddate, String discount, String threshold, String maxdiscount, String description, String termsandconditions) throws InterruptedException 
		{   implicitwait(5000);
			Thread.sleep(4000);
			createcampaignclick.click();
			Thread.sleep(4000);
			createcampaignbuttonclick.click();
			Thread.sleep(5000);
			nameofcampaign.sendKeys(campaignname);
			Thread.sleep(1000);
			clicksubtype.click();
			Thread.sleep(1000);
			selectoption.click();
			Thread.sleep(1000);
			couponcode.sendKeys(entercouponcode);
			clicknextbutton.click();
			selectdatetype.click();
			Selectoption.click();
			clickdynamicoption.click();
			Thread.sleep(2000);
			Selectoptionofdynamicddown.click();
			Enterstartdate.sendKeys(startdate);
		    Enterenddate.sendKeys(enddate);
		    Alldayscheckbox.click();
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='allStores']"))).build().perform();
			clickselectelecttime.click();
			selectstarttime.click();
			a.moveToElement(driver.findElement(By.xpath("//label[text()='End Time ']"))).click().build().perform();
			clickendtime.click();
			Thread.sleep(1000);
			selectendtime.click();
			a.moveToElement(driver.findElement(By.xpath("//label[text()='End Time ']"))).click().build().perform();
			selectallstores.click();
			selectallproducts.click();
			clicnextpagebutton.click();
			clickoffertype.click();
			clickperecent.click();
			clickandenterdiscount.sendKeys(discount);
			clickandenterthreshold.sendKeys(threshold);
			clickandentermaxdiscount.sendKeys(maxdiscount);
			clickdiscounteditems.click();
			clicknexttbutton.click();
			clickcouponlabel.click();
			enterdescription.sendKeys(description);
			clickandenterterms.sendKeys(termsandconditions);
			clicknextttbutton.click();
			clicksubmitbutton.click();
			Thread.sleep(1000);
			clickactive.click();
			Thread.sleep(1000);
			clickonok.click();
 //			waitForElementToAppear(clickOOK);  //this method is coming from reusable componenets as we have extended it // eg of how to use By in page factory waits  see line no 162 also 
			CreateCampaign fw = new CreateCampaign(driver);
			fw.Logoutofapp();
			driver.close();
	// 		WaitForElementToDissapear(clicks);thi smethod s cominf from reusable components as we have extenedd it // eg of how to use we element paf=ge factory i waits seee line no 164,165 also 
		}
		
		
}
