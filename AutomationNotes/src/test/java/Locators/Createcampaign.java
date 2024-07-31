package Locators;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Createcampaign extends Login 
{
	public Createcampaign() {
		// TODO Auto-generated constructor stub
	}

	public Createcampaign(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Createcampaign c = new Createcampaign();
		c.locatorsmethod();
	}
	
    @Test
	public void locatorsmethod()throws InterruptedException, IOException, AWTException {
		
	    Logincall();  // calling login code or method here
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Create Campaigns']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-primary ant-btn-block']")).click();
        driver.findElement(By.cssSelector("input[placeholder='name']")).sendKeys("Automate Test");
 //       Thread.sleep(4000);
        driver.findElement(By.cssSelector("div[unselectable='unselectable']")).click();
 //       Thread.sleep(2000);
        driver.findElement(By.cssSelector("li[class='ant-select-dropdown-menu-item ng-star-inserted']:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input[placeholder='MKT (Optional)']")).sendKeys("QWER");
        driver.findElement(By.cssSelector("button[class='next pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
        driver.findElement(By.xpath("//div[text()='Select date Type']")).click();
        driver.findElement(By.cssSelector("li[class='ant-select-dropdown-menu-item ng-star-inserted']:nth-child(2)")).click();
        driver.findElement(By.xpath("//div[text()='Select Dynamic Date period']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")).click();
        driver.findElement(By.id("campaignArray.validFrom")).sendKeys("1");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname='validTo']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='validTo']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        
        Actions act = new Actions(driver);  
        act.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='allStores']"))).perform();
        
 //       Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Select time'])[1]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@class='ant-time-picker-panel-select-option-selected ng-star-inserted'])[1]")).click();
        act.moveToElement(driver.findElement(By.xpath("//label[text()='End Time ']"))).click().build().perform();
        Thread.sleep(1000); 
        driver.findElement(By.xpath("(//input[@placeholder='Select time'])[2]")).click();
        driver.findElement(By.xpath("(//li[@class='ant-time-picker-panel-select-option-selected ng-star-inserted'])[2]")).click();
        act.moveToElement(driver.findElement(By.xpath("//label[text()='End Time ']"))).click().build().perform();
        
 //       Thread.sleep(2000);

        
        // click on select all stores check box
        driver.findElement(By.xpath("//input[@formcontrolname='allStores']")).click();
        
        // lcik on select all products 
        driver.findElement(By.xpath("//input[@formcontrolname='allProducts']")).click();
        
        // click on next button 
        driver.findElement(By.xpath("//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
        
//        Thread.sleep(2000);
        
        // click on offer type 
        driver.findElement(By.xpath("//nz-select[@formcontrolname='couponType']")).click();
        
        // click on percent 
        driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")).click();
        
        // click on enter discount 
        driver.findElement(By.xpath("//input[@onkeypress='return event.charCode >= 48']")).click();
        driver.findElement(By.xpath("//input[@onkeypress='return event.charCode >= 48']")).sendKeys("50");
        
//        Thread.sleep(2000);
        // click on enter threshold 
        driver.findElement(By.xpath("//input[@formcontrolname='threshold']")).sendKeys("40");
           
        
        // click on on max discount 
        driver.findElement(By.xpath("//input[@formcontrolname='maxDiscount']")).sendKeys("20");
        
        // click on not valid for already discounted items checkbox
        driver.findElement(By.xpath("//input[@formcontrolname='fullPrice']")).click();
        
        // click on next button
        driver.findElement(By.xpath("//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
        
        // click on coupon label 
        driver.findElement(By.xpath("//input[@placeholder='Enter Coupon Label']")).sendKeys("Automate");
        
        Thread.sleep(2000);
        
        // click on Description 

        driver.findElement(By.xpath("//textarea[@nzplaceholder='Enter Campaign Description...']")).sendKeys("Hi user this is a test");
        
        Thread.sleep(2000);
        // click on Terms and conditions 
        driver.findElement(By.xpath("//textarea[@formcontrolname='termsAndConditions']")).sendKeys("User must be unique");
        
        Thread.sleep(2000);
        // click on next button 
        driver.findElement(By.xpath("//button[@class='next pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
        
        // click on submit button 
        driver.findElement(By.xpath("//button[@class='button pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
        
        
        
        
        Thread.sleep(2000);
        Logoutcall();     // calling logout code or method here 
       
       
        
 

	}

}
