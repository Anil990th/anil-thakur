package swan;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageobject.CreateCampaign;


public class Createcampaign extends RegisterCustomer {
 
	
	public Createcampaign(WebDriver driver) 
	{
		super(driver);
		
	}

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\AutomationNotes\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	     
	//	LaunchingBrowser();     //error unable to use it as of now nut importntg will fix it soon 
		Createcampaign  rc = new Createcampaign (driver);
		rc.Landingpage("https://app.swan.cx/app/setup");
		rc.Loginapp("anil.thakur@loyalytics.in","Anil#@1999");
		
		
		rc.implicitwait(10);
		
		CreateCampaign F = new CreateCampaign(driver);
		F.createcampaignf("Automation testing","Summ","1","7","50","40","100","Hey user grab the offer now","offer valid for payment above 5000");
		
	
		
		
		
		
		
		
		

	}

	
	
	
	
}
