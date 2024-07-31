package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Splittingtext {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("window.scrollBy(0,600)");
		
	
	
	                        ///// How to split the text and compare it , prcoees starts from below ////
	                                // for explanation watch video 
	
	System.out.println(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());
	
	 String splittedtext  = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	
	System.out.println(splittedtext);
	
	                             ////// No how to comare ////
	
	
	Assert.assertEquals(splittedtext,"296");
	
	
	
	
	
		
	

	}

}
