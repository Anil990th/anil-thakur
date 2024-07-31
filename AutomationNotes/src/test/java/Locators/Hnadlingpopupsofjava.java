package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hnadlingpopupsofjava 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String s = "Anil";
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("name")).sendKeys(s);
	    driver.findElement(By.id("alertbtn")).click();
	    
	    Thread.sleep(2000);
	    
	    // in the below line we are swithcing to alert and grabbing the text present in the popup/alert by using sopln
	   System.out.println(driver.switchTo().alert().getText());
	    
	    // In below line we are switching from driver alerts and clicking ok on the popup/alert that popuped on the page .
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.id("confirmbtn")).click();
	    
	    // in the below line we are swithcing to alert and grabbing the text present in the popup/alert by using sopln
		   System.out.println(driver.switchTo().alert().getText());
	    
	    Thread.sleep(2000);
	    // In the below line we are switching from driver to alerts and clicking on cancel on the popup/alert that popuped on the page.
	    driver.switchTo().alert().dismiss();
	    
	    
	    
	    // thhis method is used where no HTML structure is used in popups/alerts
	    // you have to switch every time you write a code for handling alerts/popups which are not using HTML structure.

	}

}
