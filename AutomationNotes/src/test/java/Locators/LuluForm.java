package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LuluForm {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver = new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		 
		driver.get("https://lulu-microsite.azurewebsites.net/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='join']")).click();
		driver.findElement(By.xpath("//select[@id='input_1']")).click();
		driver.findElement(By.xpath("//input[@id='input_2']")).click();
		driver.findElement(By.xpath("//input[@id='input_2']")).sendKeys("ABC" , Keys.TAB,"XYZ" , Keys.TAB,"INDIAN");
		driver.findElement(By.xpath("//input[@id='input_5']")).click();
		driver.findElement(By.xpath("//input[@id='input_5']")).sendKeys("501234526");
		driver.findElement(By.xpath("//a[@class='form__verify-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input_9']")).click();
		driver.findElement(By.xpath("//input[@id='input_9']")).sendKeys("123456");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='formkit-decorator']")).click();
		Thread.sleep(1000);
	
		
				
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		//driver.close();
		

	}

}



