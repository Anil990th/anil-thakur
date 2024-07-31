package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuugestionDdownHandling {   // if dynamic in nature //2

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
        Thread.sleep(4000);
       List<WebElement> Options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
       
       for(WebElement Option : Options)
       {
    	      if(Option.getText().equalsIgnoreCase("India"))
    	      {
    	                 Option.click();
    	                 break;
    	      }
       }
        
		
		                     // Explanation for this code in give in copy //
                                   //  Video no 58//
       
       
       
	}
	


}
