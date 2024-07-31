package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class Assertions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).click();
		
		                         // Verifying whether check box is selected or not bu using is selected method
		                         // This method will give error if it is selected if not it will return false
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).isSelected());
		
		                           // using boolean assertion in below line ////
		
		               // using the assertion also we are verifying whether the check box ias selected or not 
		              // But the main advantage her is that we not neeed to see the console (Like is selected method) it will directly fail the test 
		 // If you want to test the below line tehn after in place of true give false you will see .
	   Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).isSelected());
	
 	 
	           ////               // Using EQUAL boolean Assertion // it used to compare Values            //////////////
	   
	   
	                  // Writing this code to show the example of equalassertion//
	           // HOW TO USE EQUAL ASSERTION WILL START AFTER THIS COSE /////
	   driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       
       int A = 1;
       while(A<5)   //  Here Default value in A is 1 then 2 then 3 then 4 when value becomes 5 it has not 
    	            // executed the code in while loop and go out of the while loop .
       {
    	   driver.findElement(By.id("hrefIncAdt")).click();
    	   A++;  // incrementing with 1
    	   
       }

        
                    // How to use for loop 
        
        for(int B=1;B<5;B++)// we can use while or for any depend on the best for area // here we are just doing 
        	                // everything in one like else everything else is same as while loop
        {
         driver.findElement(By.id("hrefIncChd")).click();
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("divpaxinfo")).getText();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        /////////////////// FROM BELOW YOU WILL LEARN HOW TO USE EQUAL boolean ASSERTION ///////
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 4 Child");
        
        Assertions method2 = new Assertions();
        method2.Example2ofassertions(driver);
        
        
		//// Video No 61 and explanation is given in copy ///////
	}
	
	public void Example2ofassertions(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// clicking ticking on checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		// verifying wheteher it is selected or not 
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// clicking unticking checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
	// 	the below line is joiust for practice here iam checking the number of checkboxes present in the page .
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
		
		
	}

}
