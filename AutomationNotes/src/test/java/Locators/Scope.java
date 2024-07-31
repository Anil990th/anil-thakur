package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scope {

	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    
	    
	        ///// How to limit teh scopr or area of the driver to a specific area /////
	    
	    // Question - Find the links present in the footer section of the above website //////
	    
	//    Step 1 - Find the element which highlight thae whole section in which you want to limity the scope of driver
	//    Step 2 - Store it in a variable by prefixing web element behind it 
	    /// next steps u understand by looking ata the code /////
   WebElement footerScope =  driver.findElement(By.id("gf-BIG"));	    
  System.out.println(footerScope.findElements(By.tagName("a")).size());
	    footerScope.findElement(null); // this line is joust for understanding.

	}
                // Note clear your doubt  watch class ClassForFrames there is some different way there used in 
	             // Which we are findinga element which contains all the elements in which we want to limit the scope )
}                              // I GUESS BOTH THE WAYS ARE REQUIRED ACC TO THE CONDITION /////
