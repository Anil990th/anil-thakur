package Locators;                                          
                                // You tube video channel =Mukesh otwani , video name = How to perform drag and drop in selenium web driver 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JourneyBuilder extends Createcampaign  {

	public JourneyBuilder(WebDriver driver)
	{
		super(driver);
		
	}

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		JourneyBuilder J = new JourneyBuilder(driver);
		J.Landingpage("https://app.swan.cx/app/setup");
		J.implicitwait(10);
		J.Loginapp("anil.thakur@loyalytics.in","Anil#@1999");
        driver.findElement(By.xpath("//span[text()='Journey Workflows']")).click();   
        Actions A = new Actions(driver);     
        A.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search Journeys']"))).build().perform();
        driver.findElement(By.xpath("//button[contains(@class,'view-journe')]")).click();  
        A.moveToElement(driver.findElement(By.xpath("//div[@class='template-showcase-container--overlay-layer']"))).build().perform();
        driver.findElement(By.xpath("//button[@class='btn-add ant-btn ant-btn-primary']")).click();
        
        // DEAG AND DROP //    // Method 1 when you have source and destination //
                                                        // click and hold -- clicking and holding the element you want to move 
 //       A.clickAndHold(driver.findElement(By.xpath("(//div[@class='journey-sidebar__toolbar-controllers-wrapper-icon-container'])[5]"))); 
        
                                                   // move to the element where you want to drop -- going to the element where you want to drop the element 
 //       A .moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active ng-star-inserted']"))); 
         
 //       A .release().build().perform();  // release means drop
        
                                // Method 2 when you dont have destination .
        
           // Moving occurance of event to the canvas 
        A.dragAndDropBy(driver.findElement(By.xpath("(//div[@class='journey-sidebar__toolbar-controllers-wrapper-icon-container'])[5]")),260,110).build().perform();
        A.moveToElement(driver.findElement(By.xpath("(//div[@class='journey-sidebar__toolbar-controllers-wrapper-icon-container'])[16]"))).build().perform();

           // Moving web push to the canvas 
        A.dragAndDropBy(driver.findElement(By.xpath("(//div[@class='journey-sidebar__toolbar-controllers-wrapper-icon-container'])[13]")),560,10).build().perform();
          
             // clicking and holdong the circle of occurance of events 
        WebElement Source = driver.findElement(By.cssSelector("body > app-root:nth-child(3) > app-layout:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-journey-builder:nth-child(2) > div:nth-child(1) > div:nth-child(2) > app-journey-header:nth-child(1) > nz-tabset:nth-child(2) > div:nth-child(2) > div:nth-child(1) > app-journey-canvas:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > svg:nth-child(3) > g:nth-child(2) > g:nth-child(2) > g:nth-child(2) > g:nth-child(1) > g:nth-child(11) > text:nth-child(2) > tspan:nth-child(1)"));
        A.clickAndHold(Source);
                      // unable to drop it at the web push 
           
                                         //     Plan dropped because unable to drag and drop arrow from one trigger to another trigger
        
                                               
        
        
        
        
        
        
        
                              

  
   
        
        
        
        
        
        
        
     
        
        
        
        
        
        
  //      A.clickAndHold(driver.findElement(By.id("v-9043")));
  //     A.
        
    
    
		

	}

	private void Landingpage(String string) {
		// TODO Auto-generated method stub
		
	}

	private void implicitwait(int i) {
		// TODO Auto-generated method stub
		
	}

	private void Loginapp(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}    
