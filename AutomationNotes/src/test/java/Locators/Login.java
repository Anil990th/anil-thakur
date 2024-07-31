package Locators;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	
    public  WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException , AWTException 
	{         
		     
	          Login A = new Login();     // We are calling the method in same class hence creating a object of 
	          A.Logincall();                  //the class in which the method is present and by .get method calling
	          A.Logoutcall();                        // This is the procedure to call the methods i same class

	}
	
	public void Logincall() throws InterruptedException, IOException , AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\AutomationNotes\\driversfolder\\chromedriver.exe"); //path of the chromedriver
		ChromeOptions options = new ChromeOptions();//for separate browser as per new rules of chrome
		options.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");  //for separate browser as per new update , location of the chromebrowser for testing
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://app.swan.cx/login");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anil.thakur@loyalytics.in",Keys.TAB,"Anil#@1999");
		driver.findElement(By.xpath("//button[@id='btn']")).click();
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[text()='Logout']")).click();
	//	Thread.sleep(5000);
	//	driver.close();
	}
	public void Logoutcall() throws InterruptedException, IOException ,AWTException 
	{   
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

	
	

}
