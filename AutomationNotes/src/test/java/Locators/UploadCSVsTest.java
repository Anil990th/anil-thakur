package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadCSVsTest {
// use this code for customer , employee and item make some little changes and can use it.
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new EdgeDriver();
			
			// Maximize window
			driver.manage().window().maximize();
			
			// open swan application 
			driver.get("https://app.swan.cx/login");
			Thread.sleep(2000);
			
			// Enter email address.
			driver.findElement(By.id("email")).sendKeys("anil.thakur@loyalytics.in");
			Thread.sleep(1000);
			
			// Enter password
			driver.findElement(By.id("pass")).sendKeys("Anil@1999");
			Thread.sleep(2000);
			
			// click on Login Button .
			driver.findElement(By.xpath("//button[@id='btn']")).click();
	        Thread.sleep(5000);
	        
	        // click on Setting
	        driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
	        Thread.sleep(2000);
	        
	        // click on uploads 
	        driver.findElement(By.xpath("(//div[@class='ant-card-meta-title ng-star-inserted'])[7]")).click();
	        Thread.sleep(1000);
	        
	        // click on "+" button .
	        driver.findElement(By.xpath("//button[@class='pull-right ant-btn ng-star-inserted ant-btn-primary ant-btn-circle ant-btn-lg ant-btn-icon-only']")).click();
	        Thread.sleep(1000);
	        
	        //click on Customer 
	        driver.findElement(By.xpath("//label[@nzvalue='customer']")).click();

	}
                    
}
