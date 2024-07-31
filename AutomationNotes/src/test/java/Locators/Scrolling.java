package Locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Scrolling using pixel  ( ScrollBy Method) ///
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");   // downward scrolling //
		
		                                                               //// window.scrollTo(0,600)- cross check this in console first ???
		// Scrolling using web element (Scroll to method) ///
		//	js.executeScript("window.scrollTo(0,900)");  //downward scrolling //
		
		
		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,-50)");  // upward scrolling 
		               // above same thing can be done by scroll by method as shown below ////
//		js.executeScript("window.scrollBy(0,-500)");  // upward scrolling   ***** Difference Scroll to will take u to the top ***
		                                              //                    *****            Scroll By will take u according to the pixel****
		
		
		
		                     // Below methos id to scroll to a particular element ///
//		Actions A = new Actions(driver);
//		A.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
		        
		
		                           // Scrolling vertically ////
		
		//// Lokk for some videos on you tube /////
		
		//  ************** //// Scrolling inside the Main scroll or on a component //////////////+++++++++++++//
		
		js.executeAsyncScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
		
		                        
		                           
		
	}
	
	

}
