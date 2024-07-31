package Locators;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;                       ////// Video No 64 + cpy ////////////




public class Verifyenabledisable extends Login 
{

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Verifyenabledisable V = new Verifyenabledisable();
		V.Enabledisableverify();

	}


	public void Enabledisableverify() throws InterruptedException, IOException, AWTException 
	{

		Logincall();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on customer profile .
		driver.findElement(By.xpath("//span[text()='Customer Profile']")).click();

		driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-default']")).click();

		// Whats app preference Enabled    /// the way of finding this locfator is imp /////
		driver.findElement(By.xpath("(//nz-button-group[contains(@class,'preferences ant-btn-group')])[4]//button[1]"))
		.click();

		// Theis first Method
    //    System.out.println(driver.findElement(By.xpath("(//nz-button-group[contains(@class,'preferences ant-btn-group')])[4]//button[1]"))
    //   .isEnabled());

		//////// Second Method / Another way If first method doesn't work /////////
		
		
		        // Ex[lanation of below line - 1. find the locator for Enabled button 
		                                  // - 2. Then find the locator of disabled button 
		                                  //. 3. Now compare them and check on enabling and disabling what values are changing
		                                  //. 4. then use tatat attribute in get attribute as shown in below line 
		                                  //.5. then in contains use that changing value as shown in below line .
		                          // then use if condition .
         if(driver.findElement(By.xpath("(//nz-button-group[@class='preferences ant-btn-group'])[4] //button[1]")).getAttribute("class").contains("selected"))
         {
        	 System.out.println("is enabled");
        	               
         }
         else
         {
        	 System.out.println("Not selected");
         }
         

	}

}
