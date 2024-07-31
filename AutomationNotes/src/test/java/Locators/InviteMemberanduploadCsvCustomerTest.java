package Locators;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InviteMemberanduploadCsvCustomerTest {

	@Test
	public static void inviteCuploadCsv() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		// Maximize window
		driver.manage().window().maximize();
		
		//Implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open swan application 
		driver.get("https://app.swan.cx/login");
//		Thread.sleep(2000);
		
		// Enter email address.
		driver.findElement(By.id("email")).sendKeys("anil.thakur@loyalytics.in");
//		Thread.sleep(2000);
		
		// Enter password
		driver.findElement(By.id("pass")).sendKeys("Anil#@1999");
//		Thread.sleep(2000);
		
		// click on Login Button .
		driver.findElement(By.xpath("//button[@id='btn']")).click();
        Thread.sleep(5000);
        
        // click on Setting
        driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
 //       Thread.sleep(2000);
        
       // click on invite member
        driver.findElement(By.xpath("//div[text()='Invite Members']")).click();
        
       // Click on "+" Button
        driver.findElement(By.xpath("(//button[@class='add-btn-css ant-btn ant-btn-default ant-btn-round'])[1]")).click();
 //       Thread.sleep(2000);
        
       // Enter first name 
        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("ABC");
        
       // Enter last name 
        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("CBA");
        
       // Enter Email address
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("testloyalytics@gmail.com");
        
       //Click on customer 
        driver.findElement(By.xpath("//label[@nzvalue='custom']")).click();
   //     Thread.sleep(2000);
        

    	Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//div[@role='tab'])[15]"))).perform();
        
     
    
         //Click On Uploads
          driver.findElement(By.xpath("(//div[@role='tab'])[14]")).click();
   //       Thread.sleep(2000);
          
          
         //click on set Granular access 
          driver.findElement(By.xpath("(//p[@class='granular-access'])[2]")).click();
          Thread.sleep(2000);
          
         //click on check box
          driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[2]")).click();
          Thread.sleep(2000);
          
          // click on Ok
          driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-primary']")).click();
          
          // click on save 
          driver.findElement(By.xpath("//button[@class='drawer-footer-btn drawer-footer-btn--save ant-btn ng-star-inserted ant-btn-default']")).click();
          
          // click on Send invite
          driver.findElement(By.xpath("//button[@class='form-button form-margin ant-btn ng-star-inserted ant-btn-primary']")).click();
          
          Thread.sleep(5000);
          
          // click on logout
          driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
   //       Thread.sleep(1000);
      	  driver.findElement(By.xpath("//span[text()='Logout']")).click();
  //        Thread.sleep(1000);
    
			
		  // open swan application // Login by id to which invite sent...............................
			driver.get("https://app.swan.cx/login");
	//		Thread.sleep(2000);
			
			// Enter email address of the member to which invite sent.
			driver.findElement(By.id("email")).sendKeys("testloyalytics@gmail.com");
			Thread.sleep(1000);
			
			// Enter password
			driver.findElement(By.id("pass")).sendKeys("Anil#@19999");
	//		Thread.sleep(1000);
			
			// click on Login Button .
			driver.findElement(By.xpath("//button[@id='btn']")).click();
	//        Thread.sleep(3000);
	        
	        // click on Setting
	        driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
	  //      Thread.sleep(2000);
	        
	        // click on uploads 
	        driver.findElement(By.xpath("(//div[@class='ant-card-meta-title ng-star-inserted'])[2]")).click();
	        Thread.sleep(1500);
	        
	        // click on "+" button .
	        driver.findElement(By.xpath("//button[@class='pull-right ant-btn ng-star-inserted ant-btn-primary ant-btn-circle ant-btn-lg ant-btn-icon-only']")).click();
	        Thread.sleep(1000);
	        
	        //click on Customer 
	        driver.findElement(By.xpath("//label[@nzvalue='customer']")).click();
	        
	        // click on drag
            driver.findElement(By.xpath("//p[@class='ant-upload-text ng-star-inserted']")).click();
   //         Thread.sleep(1500);
            
            // upload file
            Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\CSVautomate.exe");
   //         Thread.sleep(3000);
   
            // click on drop down
            driver.findElement(By.xpath("(//div[text()='Map With Swan Columns'])[1]")).click();
   //         Thread.sleep(1000);
            
            // Click on Mobile
            driver.findElement(By.xpath("//span[@class='required ng-star-inserted']")).click();
          Thread.sleep(2000);
            
         //   Actions scrl = new Actions(driver);///////// not eorking 
         //   scrl.scrollByAmount(0, 2000).perform();////// not working 
            
            Thread.sleep(4000);
            
            //Click on Import
            driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
            Thread.sleep(5000);
            
            // close the app
            Thread.sleep(2000);
            driver.close();
            
	}

}
