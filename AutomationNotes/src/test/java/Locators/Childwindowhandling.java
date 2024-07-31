package Locators;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Childwindowhandling {
                                                       // Child window means when you clik on something and another tab is opened //
	public static void main(String[] args) 
	{
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		// How to change the focus/scope of driver form one window to another window that is opened //
		
		// Step 1 - We will check how many windows are opened by looking/manuall 
		// Step 2 - Then we will get the ids of that windows as shown in below steps //
		
		//The below line fetch te ids of the windows/tabs that are opened // and arte stored in windows variable.
		Set<String> windows =driver.getWindowHandles();
		
		// TH ebelow line will take the ids that we have stored in windows varibale// //
		Iterator<String> it = windows.iterator();
		
		// .next method will fetch the id of the first window in below step we are fetchiong the id of the first window//
		// and storing it in oarentid variable//
		String parentID = it.next();
		
		// nbow by using it .next it will move from fisrst to second window and take the is of it //
		String child = it.next();
		
		// Now we will switch to child   //
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//P[@class='im-para red']")).getText());
		
		// if you want to get back to main window//
	//	driver.switchTo().window(parentID);
		
		////////     HOW to fetch/parse specific words from A """ String"""" using Selenium /////     
		                    // and also you how to compare ///
		                           // Full steps are in Video no 89///////
		
	System.out.println(driver.findElement(By.xpath("//P[@class='im-para red']")).getText());
	driver.findElement(By.xpath("//P[@class='im-para red']")).getText();   
String emailid =	driver.findElement(By.xpath("//P[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];

    System.out.println(emailid);
    
        ///////////////////////////////// switching to main window//////////////////and pasting the email id in username
    
    
    driver.switchTo().window(parentID);
    driver.findElement(By.id("username")).sendKeys(emailid);


	}
	

}
