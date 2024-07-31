package Locators;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class Handleingcalender {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	    Set<String>	windosid =driver.getWindowHandles();
	    Iterator<String> it = windosid.iterator();   
	    String parentWindow = it.next();
	    String cHildwindow = it.next();
	    driver.switchTo().window(cHildwindow);
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		

		
		for (int i=0;i<3;i++) 
		{
			
      	 driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();

		}
		                                       
		                           // // for clicking multiple times use for loop as shown above ////
		                              //         ** dont write multiple times as shown below **
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();
		
		
		int x = 0;  //initialize
		while(x<3)  // condition
		{
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
			x++;  // increment 
		}
		
		                           // fpr  multiple time you can use whilee loop alao used as above ////
		                            /// dont rite three times as shown below/////
		
 // **      driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
 //**       driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
  //**      driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
        
        
        
        
        
        driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day'][11]")).click();
        
        
        // When i sused the below line it didnt worked it gived output // 
        // Sometimes it happens specially in calender handeling //
        // So how to handle it is explained below //
        System.out.println(driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText());
        
                           // Explanation //
        // Check thaty in which element all these value are getting stored and store them in a list using find elements method///
        
               //     or just saw the video no 99 Everything is there //
        
        
        
        
	}  

}
