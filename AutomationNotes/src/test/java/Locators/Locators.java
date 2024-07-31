package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new EdgeDriver();
		driver.get("https://app.swan.cx/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anil.thakur@loyalytics.in",Keys.TAB,"Anil@1999");
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(4000);
		//Scroll required
		driver.findElement(By.xpath("//span[text()='Create Campaigns']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='ant-btn ng-star-inserted ant-btn-primary ant-btn-block']")).click();
        driver.findElement(By.cssSelector("input[placeholder='name']")).sendKeys("Romeo");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div[unselectable='unselectable']")).click();
 //       driver.findElement(By.cssSelector("li[class='ant-select-dropdown-menu-item ng-star-inserted']:nth-child(1)")).click();
		
		

	}

}
