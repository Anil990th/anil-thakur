package Locators;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actionsclass extends Login{
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
		Actionsclass A = new Actionsclass();
		A.actionClassPractice();

	}
	
	public void actionClassPractice() throws InterruptedException, IOException, AWTException
	{
		
//		WebDriver driver = new EdgeDriver();
		Logincall();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions A2 = new Actions(driver);
		
		
		// How to move to an specific element .
		A2.moveToElement(driver.findElement(By.xpath("//span[text()='Customer Profile']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Customer Profile']")).click();
		
		// How to write in Capital letters using Keyword Shift key 
         A2.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search By Phone Number, Email, Name']"))).click().keyDown(Keys.SHIFT).sendKeys("anil").build().perform();	
	
         // How to Right Click //
       A2.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search By Phone Number, Email, Name']"))).contextClick().build().perform();
	}

}
