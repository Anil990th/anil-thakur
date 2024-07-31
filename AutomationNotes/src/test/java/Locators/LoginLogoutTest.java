package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLogoutTest {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new EdgeDriver();
	driver.get("https://app.swan.cx/login");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anil.thakur@loyalytics.in",Keys.TAB,"Anil#@1999");
	driver.findElement(By.xpath("//button[@id='btn']")).click();
	
	
	
	
	// Logout
	Thread.sleep(5000);
	driver.findElement(By.xpath("//i[@nztype='user']/..//span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Logout']")).click();
	Thread.sleep(5000);
	driver.close();
	
	
}
}
