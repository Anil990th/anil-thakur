package Locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ereceipts extends Login {
	
    
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Ereceipts E = new Ereceipts();
		E.Locatorsofereceipty();
		
	}
	
	
	@SuppressWarnings("deprecation")
	public  void Locatorsofereceipty() throws InterruptedException, IOException, AWTException
	{
		Logincall();
	//	Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	System.out.println(driver.getCurrentUrl());
   	System.out.println(driver.getTitle());
	 
     driver.findElement(By.xpath("//span[text()='e-Receipt']")).click();
//     Thread.sleep(4000);
     driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[class='tw-relative tw-border tw-rounded-lg tw-px-2 ng-untouched ng-pristine ng-valid']")).clear();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("SWAN Headquarters");	
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//div/button)[4]")).click();
     driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[2]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@placeholder='Phone']")).clear();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9101818886");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[@class='tw-p-1 tw-border tw-rounded-lg tw-bg-indigo-600 tw-text-white']")).click();
     
  //   Thread.sleep(2000);
     // printing the mobile number entered 
    System.out.println(driver.findElement(By.xpath("//span[text()='9101818886']")).getText());
 //    Thread.sleep(2000);
     
   //  Second Verification using assert if the mob no isn't correct it will throw error
     Assert.assertEquals(driver.findElement(By.xpath("//span[text()='9101818886']")).getText(),"9101818886");
     
//     Thread.sleep(2000);
    
     // Printing the address we entered 
     System.out.println(driver.findElement(By.xpath("//span[text()='SWAN Headquarters']")).getText());
//     Thread.sleep(2000);
     
     // Second Verification using assert if the entered text isn't correct it will throw error
     Assert.assertEquals(driver.findElement(By.xpath("//span[text()='SWAN Headquarters']")).getText(),"SWAN Headquarters");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[3]")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
     
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test01@test.com");
     
     driver.findElement(By.xpath("//button[@class='tw-p-1 tw-border tw-rounded-lg tw-bg-indigo-600 tw-text-white']")).click();
     
     //Printing the email address we entered
 //    Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//span[text()='test01@test.com']")).getText());
    // Second verification if the entered email is not matching then it will throw an error
    Assert.assertEquals(driver.findElement(By.xpath("//span[text()='test01@test.com']")).getText(),"test01@test.com");
     
     driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[4]")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[placeholder='Website']")).clear();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input[placeholder='Website']")).sendKeys("https://www.snapchat.com/");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//BUTTON[@CLASS='tw-p-1 tw-border tw-rounded-lg tw-bg-indigo-600 tw-text-white']")).click();
     
     Thread.sleep(1000);
     // Printing the link we entered 
   System.out.println(driver.findElement(By.xpath("//span[text()='https://www.snapchat.com/']")).getText());
   
   // second verification using assert if the entered url is not matching with actual it will throw an error
   Assert.assertEquals(driver.findElement(By.xpath("//span[text()='https://www.snapchat.com/']")).getText(),"https://www.snapchat.com/");
   
   driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[5]")).click();
   driver.findElement(By.xpath("//input[@placeholder='Timings']")).clear();
   driver.findElement(By.xpath("//input[@placeholder='Timings']")).sendKeys("24X7");
   driver.findElement(By.cssSelector("button[class='tw-p-1 tw-border tw-rounded-lg tw-bg-indigo-600 tw-text-white']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.id("headerImage1-label")).click();
   Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\Ereceiptupload.exe"); // Image upload done using Autoit Software
   
   Thread.sleep(2000);
   driver.findElement(By.id("headerImage2-label")).click();
   Thread.sleep(2000);
   Runtime.getRuntime().exec("D:\\Ereceiptuploadimage2.exe");              // Second image uploaded 
//   Thread.sleep(4000);
//   driver.findElement(By.xpath("//span[text()='Save']")).click();
  
   
 //  driver.findElement(By.xpath("//span[text()='24X7']")).getText();
   System.out.println(driver.findElement(By.xpath("//span[text()='24X7']")).getText());
   Assert.assertEquals(driver.findElement(By.xpath("//span[text()='24X7']")).getText(),"24X7");
   
   Thread.sleep(4000);    ///////////////////////
   
   Actions A = new Actions(driver);
   A.moveToElement(driver.findElement(By.xpath("(//span[text()='Edit'])[1]"))).perform();
   Thread.sleep(1000);
   driver.findElement(By.xpath("(//span[text()='Edit'])[1]")).click();
   driver.findElement(By.xpath("//textarea[@formcontrolname='greeting']")).clear();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//textarea[@formcontrolname='greeting']")).sendKeys("Have a great day :)");
   Thread.sleep(1000);
   A.moveToElement(driver.findElement(By.xpath("(//span[text()='Save'])[2]"))).perform();
   driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click(); 
   // ADD IMAGE 1
   //ADD IMAGE2
   /////////////////////////////////////////
   driver.findElement(By.xpath("//lib-icon-chevron-down[@class='tw-ml-2 tw-h-6 tw-w-6 tw-transition-all tw-duration-500']")).click();
   A.moveToElement(driver.findElement(By.xpath("(//span[text()='Edit'])[2]"))).perform();
   Thread.sleep(5000);
   driver.findElement(By.xpath("(//span[text()='Edit'])[2]")).click();
   
    Thread.sleep(1000);
    
    
   driver.findElement(By.xpath("//div[@class='tw-h-0 tw-group tw-relative tw-transition-all tw-duration-500 tw-opacity-0 tw-w-full tw-overflow-hidden tw-h-64 tw-opacity-100']")).click();
   Thread.sleep(1000);
      
   driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
   
   // Add image3
   Thread.sleep(4000);
   A.moveToElement(driver.findElement(By.xpath("//span[text()='Download Demo App']"))).perform();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()='Save']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-cursor-pointer tw-text-white tw-h-6 tw-w-6'])[7]")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//Select[@placeholder='Select Nps Type']")).click();
   
   Select S = new Select(driver.findElement(By.xpath("//Select[@placeholder='Select Nps Type']")));
   Thread.sleep(1000);
   S.selectByIndex(2);
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='tw-p-1 tw-border tw-rounded-lg tw-bg-indigo-600 tw-text-white']")).click();
    Thread.sleep(1000); 
    driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-h-6 tw-w-6 tw-text-white'])[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='faq']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='faq']")).sendKeys("https://dribbble.com/tags/faq");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='phone']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='phone']")).sendKeys("91018188867");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='message']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='message']")).sendKeys("https://support.link/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='tw-p-1 tw-border tw-rounded-lg tw-px-4 tw-bg-indigo-600 tw-text-white tw-px-4']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//lib-icon-edit[@class='tw-h-6 tw-w-6 tw-text-white'])[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='facebook']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='facebook']")).sendKeys("https://tinder.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='instagram']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='instagram']")).sendKeys("https://astrotalk.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='x']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='x']")).sendKeys("https://www.myntra.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='youtube']")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@formcontrolname='youtube']")).sendKeys("https://www.makemytrip.com/tripideas/resorts-&-stays-lakshadweep");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='tw-p-1 tw-border tw-rounded-lg tw-px-4 tw-bg-indigo-600 tw-text-white tw-px-4']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//div/button)[21]")).click();
    Thread.sleep(1000);
    A.moveToElement(driver.findElement(By.xpath("(//button[contains(@class,'tw-invisible tw-py-1 tw-ml-auto tw-mr-10 tw-px-4 tw-text-base tw-rounded-md tw-self-end g')])[2]"))
    ).perform();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[contains(@class,'tw-invisible tw-py-1 tw-ml-auto tw-mr-10 tw-px-4 tw-text-base tw-rounded-md tw-self-end g')])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Save']")).click();
    Thread.sleep(2000);
    A.moveToElement(driver.findElement(By.xpath("//div[@class='tw-p-8 tw-text-center tw-font-semibold tw-text-black']"))).build().perform();
    driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-primary']")).click();
    
    
    driver.close();
    



		
	}
	

	
	
	
//	 Thread.sleep(2000);
//	 driver.findElement(By.xpath("//span[text()='Save']")).click();
	

}
