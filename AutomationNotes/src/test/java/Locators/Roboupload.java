package Locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

public class Roboupload extends Login {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
	
		Roboupload R = new Roboupload();
		R.upload();

	}
	
	public void upload() throws InterruptedException, IOException, AWTException
	{
		
	Logincall();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//span[text()='e-Receipt']")).click();
	 driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[class='tw-relative tw-border tw-rounded-lg tw-px-2 ng-untouched ng-pristine ng-valid']")).clear();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("SWAN Headquarters");	
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//div/button)[4]")).click();
     
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[text()='Save']")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.id("headerImage2-label")).click();
    Robot rb = new Robot(); // Robot class willl help us to acchieve this goal
    StringSelection str = new StringSelection("C:\\Users\\Dell\\Desktop\\images upload\\Sale-banner-design-on-transparent-background-PNG-1 PNG.png"); // Using Selection
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);// used to copy the path of the file on the clipboard
    rb.keyPress(KeyEvent.VK_CONTROL);    // pressing control key 
    rb.keyPress(KeyEvent.VK_V);           // Pressing V key 

    rb.keyRelease(KeyEvent.VK_CONTROL);  // Rreleasing contgrol key 
    rb.keyRelease(KeyEvent.VK_V);        // Relesaing V key 

    rb.keyPress(KeyEvent.VK_ENTER);      // Pressing Enter
    rb.keyRelease(KeyEvent.VK_ENTER);    // Releasing eNTER 
		
	}

}
