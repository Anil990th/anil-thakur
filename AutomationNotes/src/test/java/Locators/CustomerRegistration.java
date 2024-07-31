package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CustomerRegistration {
    
	@Test
	public static void Cregistration() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		// Maximize window
		driver.manage().window().maximize();
		
		// open swan application 
		driver.get("https://app.swan.cx/login");
		Thread.sleep(2000);
		
		// Enter email address.
		driver.findElement(By.id("email")).sendKeys("anil.thakur@loyalytics.in");
		Thread.sleep(1000);
		
		// Enter password
		driver.findElement(By.id("pass")).sendKeys("Anil#@1999");
		Thread.sleep(2000);
		
		// click on Login Button .
		driver.findElement(By.xpath("//button[@id='btn']")).click();
        Thread.sleep(5000);
		
        // Click on customer profile .
		driver.findElement(By.xpath("//span[text()='Customer Profile']")).click();
		Thread.sleep(2500);
		
		// click on customer register.
		driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-default']")).click();
		
		// fill first name , Last name and email address.
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Swan", Keys.TAB,"Automate", Keys.TAB,"autoomateeed@loyalytics.com");
		Thread.sleep(1000);
		
		//click on country code dropdown.
		driver.findElement(By.xpath("(//div[@unselectable='unselectable'])[1]")).click();
		Thread.sleep(1500);
		
		// Select Country code fro the dropdown.
		driver.findElement(By.xpath("(//li[@unselectable='unselectable'])[177]")).click();
		
		// Enter Phone  number.
		driver.findElement(By.xpath("(//input[@formcontrolname='mobile'])")).sendKeys("91018766100");
		
		// click on Date of birth column.
		driver.findElement(By.xpath("//input[contains(@placeholder,'date')]")).click();
		
		// Select date from calendar .
		driver.findElement(By.xpath("(//div[text()=' 10 '])[1]")).click();
		
		// Click on Nationality Dropdown.
		driver.findElement(By.xpath("//div[contains(text(),'Nationality')]")).click();
		
		// select country from the dropdown .
		driver.findElement(By.xpath("(//li[@unselectable='unselectable'])[9]")).click();
		Thread.sleep(1500);
		
		// Click on Gender dropdown .
		driver.findElement(By.xpath("//div[text()='Please select your Gender']")).click();
		
		// Select Gender from dropdown .
		driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")).click();
		
		// Click on Language Dropdown.
		driver.findElement(By.xpath("//div[text()='Please select your Language']")).click();
		Thread.sleep(1500);
		
		// Select Language from the drop down.
		driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][7]")).click();
		Thread.sleep(2000);
		
		//Enter value on Address column.
	    driver.findElement(By.xpath("(//input[@Placeholder='Please enter value'])[1]")).sendKeys("Bangalore Headquarters");
	    
	    // Click on Emergency drop down.
		driver.findElement(By.xpath("//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")).click();
		Thread.sleep(1000);
		
		// Enter value in the Emergency drop down .
		driver.findElement(By.xpath("//input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']")).sendKeys("9101818887");
		
		// Click on Join Bispro drop down.
		driver.findElement(By.xpath("//div[text()='Please select your option']")).click();
		
		//Select value from the join bispro dropdown.
		driver.findElement(By.xpath("//li[@class='ant-select-dropdown-menu-item ng-star-inserted'][1]")).click();
		
		// Click on join program dropdown .
		driver.findElement(By.xpath("(//div[(contains(@class,'ant-select-selection__rendered'))])[6]")).click();
		Thread.sleep(1000);
		
		// Select value form join program dropdown.
		driver.findElement(By.xpath("(//li[@unselectable='unselectable'])[1]")).click();
		Thread.sleep(1500);
		
		
		
		// Enter value in my field column .
		driver.findElement(By.xpath("(//input[@Placeholder='Please enter value'])[2]")).sendKeys("XYZ");
		Thread.sleep(1000);
		
		// Enter value in other column.
		driver.findElement(By.xpath("(//input[@Placeholder='Please enter value'])[3]")).sendKeys("Loyalytics Saudi Arabia");
		Thread.sleep(1000);
		
		// Click on whatsapp preferences  Enable button.
	    driver.findElement(By.xpath("(//nz-button-group[contains(@class,'preferences ant-btn-group')])[4]//button[1]")).click();
	    Thread.sleep(1500);
	    
	    // Click on Register Button.
		driver.findElement(By.xpath("//button[@class='register-btn pull-right ant-btn ng-star-inserted ant-btn-default']")).click();
		Thread.sleep(5000);
		
		// Logout 
		driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		Thread.sleep(2500);
		
		// close the window.
		driver.close();
		
		
	} 

}
