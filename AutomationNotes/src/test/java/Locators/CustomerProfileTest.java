package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CustomerProfileTest {

	@Test
	public static void Cprofile ()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\Automation\\driversfolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://app.swan.cx/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("anil.thakur@loyalytics.in");
		driver.findElement(By.id("pass")).sendKeys("Anil#@1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@id='btn']")).clear();////////////
		driver.findElement(By.xpath("//span[text()='Customer Profile']")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[contains(@placeholder,'Phone Number')]"))).perform();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Phone Number')]")).sendKeys("anil.thakur@loyalytics.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'ant-btn-icon-only')])[1]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-default'])[1]")).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][1]"))).build().perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][1]")).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][2]"))).build().perform();
		Thread.sleep(2500);
        driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][2]")).click();
        Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();////
        Thread.sleep(1500);
        act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][3]"))).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][3]")).click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][4]"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][4]")).click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='ant-pagination-item-link ng-star-inserted'])[1]"))).build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][5]"))).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted'][5]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='detailsDrawerClose']")).click();
		driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		
		driver.quit();
		
		
	}

}
