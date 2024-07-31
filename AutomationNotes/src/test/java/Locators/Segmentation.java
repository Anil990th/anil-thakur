package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.LoginLogout;

public class Segmentation extends LoginLogout {

	public Segmentation(WebDriver driver)
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
		
			Segmentation S = new Segmentation(driver);

			S.Landingpage("https://app.swan.cx/app/setup");
			S.implicitwait(10);
			S.Loginapp("anil.thakur@loyalytics.in","Anil#@1999");
			// click on segment 
			driver.findElement(By.xpath("//span[text()='Segment']")).click();
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//button[@class='feedback-btn ant-btn ant-btn-default']"))).build().perform();
			
			
			Thread.sleep(3000);
			// click on create segment 
			driver.findElement(By.xpath("//button[@class='segments-container__header__button ant-btn ng-star-inserted ant-btn-primary']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Select Attributes'])[1]")));
			
			// enter Segment name 
			driver.findElement(By.xpath("//input[@placeholder='Segment Name']")).sendKeys("Automate 01");
			
			// add a tag name and send keys 
			driver.findElement(By.xpath("//nz-tag[contains(@class,'heade')]")).click();
			driver.findElement(By.xpath("//input[@class='header__tags-input ant-input ant-input-sm ng-untouched ng-pristine ng-valid ng-star-inserted']")).sendKeys("Speedup01");
			
			// click on active toggle button 
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
	        // verifying toggle button is enabled or not 
	           if(driver.findElement(By.xpath("//button[@type='button']")).getAttribute("class").contains("checked"))
	               {
	                      System.out.println("Real time segment is enabled");
	              
	               }
	               else
	               {
	                   System.out.println("Real time segment is Not selected");
	               }
		
			
			// click on user property attribute srrow
			driver.findElement(By.xpath("(//div[text()='Select Attributes'])[1]")).click();
            
			// Select the option from the dropdoen 
			driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted']")).click();
			
			
			// click on Select Dropdown 
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
			
			Thread.sleep(2000);
			// Select value from the select dropdown
			driver.findElement(By.xpath("//li[contains(@class,'ant-select')]")).click();
			
			// click on Attrinute 
			driver.findElement(By.xpath("(//span[text()='Attributes'])[1]")).click();
			
			// click on And 
			driver.findElement(By.xpath("//li[@class='ant-dropdown-menu-item'][1]")).click();
			
			// click on select attribute dropdown
			driver.findElement(By.xpath("(//div[text()='Select Attributes'])[2]")).click();
			
			// select the attribute 
			driver.findElement(By.xpath("//div[text()='Gender']")).click(); 
			
			// click select dropdwon
			driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
			
			Thread.sleep(1000);
            // Select value 
			driver.findElement(By.xpath("//li[@unselectable='unselectable']")).click();
			
			//click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[3]")).click();
			
			// select value 
			driver.findElement(By.xpath("//div[text()='Male']")).click();
			
            // Click User Behaviour Attribute arrow
			driver.findElement(By.xpath("(//i[@class='anticon ant-collapse-arrow anticon-caret-right ng-star-inserted'])[2]")).click();
			
             // Scrolling till exclude checkbox
			Actions acti = new Actions(driver);   
			acti.moveToElement(driver.findElement(By.xpath("//input[@class='ant-checkbox-input ng-untouched ng-pristine ng-valid']"))).build().perform();
			
	
			// click user behaviour select dropdown 
			driver.findElement(By.xpath("(//div[text()='Select'])[4]")).click();
			
			// Select value 
			driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")).click();
			
			Thread.sleep(2000);              // not working form here as ofnhow ///
			// click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[5]")).click();
			
			// select value
			driver.findElement(By.xpath("//div[text()='Bill Amount']")).click();
			
			// click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[6]")).click();
			
			// select value 
			driver.findElement(By.xpath("//div[text()='Is Greater than']")).click();
			
			// clickand enter value in  text area box and click on up arrow to make aggregation enable
			driver.findElement(By.xpath("//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")).sendKeys("1000");
			driver.findElement(By.xpath("//span[@class='ant-input-number-handler ant-input-number-handler-up']")).click();
			
			// click on aggregation 
			driver.findElement(By.xpath("//span[text()='Aggregation']")).click();
			
			//click on select 
			driver.findElement(By.xpath("(//div[text()='Select'])[7]")).click();
			
			// select value 
			driver.findElement(By.xpath("//div[text()='Sum']")).click();
			
			// click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[8]")).click();
			
			// Select value 
			driver.findElement(By.xpath("//div[text()='Points Issued']")).click();
			
			// click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[9]")).click();
			
			// select value 
			driver.findElement(By.xpath("//div[text()='Is Equal']")).click();
			
			// click and enter value in text area box and click on up arrow check line 143
			driver.findElement(By.xpath("//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")).sendKeys("200");
			driver.findElement(By.xpath("//span[@class='ant-input-number-handler ant-input-number-handler-up']")).click();
			
			// click on add set 
			driver.findElement(By.xpath("//span[text()='Add Set']")).click();
			  
			// click on And 
			driver.findElement(By.xpath("//li[text()='AND']")).click();
			
			// click on user behaviour attribute
			driver.findElement(By.xpath("(//i[@class='anticon ant-collapse-arrow anticon-caret-right ng-star-inserted'])[3]")).click();
			
			//scrolling till check box
			acti.moveToElement(driver.findElement(By.xpath("//input[@class='ant-checkbox-input ng-untouched ng-pristine ng-valid']"))).build().perform();
			
			Thread.sleep(4000);
			// click on select dropdown        // Error from here //////
		     driver.findElement(By.xpath("(//div[text()='Select'])[5]")).click();
			
			
			// Select value 
			driver.findElement(By.xpath("//div[text()='Segment']")).click();
			
			//click on select dropdown
			driver.findElement(By.xpath("(//div[text()='Select'])[6]")).click();
			
			// select value 
			driver.findElement(By.xpath("//div[text()='In']")).click();
			
			// click on text area box 
			driver.findElement(By.xpath("//div[text()='Input search text']")).click();
			
			// select value from text area bix
			driver.findElement(By.xpath("//span[text()='live']")).click();
			
			
	}       

}
