package Locators;
                                          // Video no 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;                              ///******* important************
                                 // For limiting scope here we used second method which is like - we finding a element 
                                 // Which is containing all the elements in which we want to limit the scope //eg Line no -41.// 
                                // Here we are not taking the element which is highlighting thw whole .eg Class name Scope.
public class ClassForFramework {
     
	@Test
	public static void main(String[] args) throws InterruptedException 
	{   
		String ProductName = "ZARA COAT 3";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("at96845@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Anil#@1999");
		driver.findElement(By.id("login")).click(); 
		
		               // Use of Explicit wait// 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		                       // Use of streams to add the product in the cart //
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(ProductName)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click(); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		driver.findElement(By.cssSelector("[routerLink*='cart']")).click();
		
		
		      // Verifying with the help of streams that the item is added to cart or not //
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match =  cartProducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(ProductName));
		Assert.assertTrue(match);
		
		// clicking on checkout
		driver.findElement(By.cssSelector(".totalRow button")).click();
        
		// select country and click using actions class
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		// placing the order
		driver.findElement(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted'][2]")).click();
		Thread.sleep(4000);
		
		// From here not working as of now 
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		
		
		
		
		
		
		
		
	  		
	    		
	    		
	    
	    
		 
	
		
	
	}

}
