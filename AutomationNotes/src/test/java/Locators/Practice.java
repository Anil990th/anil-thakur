package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
	//	EdgeDriver driver = new EdgeDriver(); // Edge driver is a class which contains methods of web driver along with its own methods so if by 
		                                      // mistake we invoke the methods of edge driver then this code might not run in ither browsers 
		                                      // to over come this we have done other method which is below.
		String name = "Anil";
		WebDriver driver = new EdgeDriver();   // Here we are telling driver to focus onoy of webdriver methods not on edge driver methods this is best practice.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();        // maximize the window
		System.out.println(driver.getTitle());      // Print the title of the page 
		System.out.println(driver.getCurrentUrl());  // print the current URL
		driver.findElement(By.id("inputUsername")).sendKeys(name);                     // Byid
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");      // by name
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();            // by visual text (x path)
		
		// How to grab the text ( For eg - You want to grab the text from the screen that "you are sccesfuly logged in ")
		                          //Below is the process to do taht//    
		Thread.sleep(4000);
	   System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
	   
	   Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in."); // validating the text
	   
	   System.out.println(driver.findElement(By.tagName("h2")).getText());       // By tagname
	   
	   Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+","); // use variable inside string space inverted commas location very sensitive
	   driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	   
	   driver.navigate().to("https://www.myntra.com/");  //going to another website
	   driver.navigate().back();                         // going back
	   driver.navigate().forward();                      // going forward
	   
	            /////*****How to call methods*****///////
	   
	   Practice P = new Practice();        //This is how to call a method within class 
	   P.Practice2();                      // if it is non static.// for one class to another class Line no 55
	   
	   P.Staticdropdowns(driver);      // Calling staticdropdown method " but why driver in brackets earlier not there in other called methods)
	                                // i think because we have user "driver.in the method so we have to do like this " (within ame class)"  //
	   
	   staticmethodtest();  // eg how you can call a static method without creating object within same class . 
	   
//	   Login L = new Login(); //This how you can call a method from other class.
//	   L.Logoutcall();       // Thismethod will not work here because the code is of different app/url this just for rxample .
	   
	   // One mpore way i sthere for calling method from one class to another class will clarify it from subbrat//
	   // for example have a look at**** CreateCampaign **** class
	   
	   
	}
	
	public  void Practice2()
	{
		int a = 10;
		System.out.println(a);
		
	}
	
	public void Staticdropdowns(WebDriver driver) throws InterruptedException  //If you are using driver . inside the new method then in brackets (pass like shown) 
	                                              // we are doing this because scope first method is till only its area //
	{
		   
		  ////////               // Handling static dropdowns //            //////////// This methiod can be used if the dropdown is created using Slect HTML tag only 
		                 // Three ways are shown below to handle it //
		   driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		           // aregument needed to pass when you create object of the select class below line shows how to do taht
		      // in argument find the element where that static dropdown is present and store it in the variable 
		   WebElement argumentvariable = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		   
		   Select staticdropdown = new Select(argumentvariable);// here we are creating an object of the Select class and 
		                                                        // in argument section we are giving the location of ststic dropdwon it is required.
		   staticdropdown.selectByIndex(2); // this is a method in select class by which we can select value from static dropdown with the help of index 
		   System.out.println(staticdropdown.getFirstSelectedOption().getText()); // printing the select value from dropdown 
		   
	       staticdropdown.selectByVisibleText("USD");  // selecting value from dropdown using visual text method os selct class
	       System.out.println(staticdropdown.getFirstSelectedOption().getText()); //  Printinjg the selected value .
	       
	       staticdropdown.selectByValue("INR");   // Selecting value from dropdown using value method if thereis a attribute ""value"" in the dropdown options
	       System.out.println(staticdropdown.getFirstSelectedOption().getText());  // Printing the selected option 
	       
	                        //***** How to use loop *****//
	       
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
	        
	        
	                               // *****//// How to Handle auto suggestions Dropdown ////*****//
	        
	        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
	        Thread.sleep(4000);
	       List<WebElement> Options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
	       
	       for(WebElement Option : Options)
	       {
	    	      if(Option.getText().equalsIgnoreCase("India"))
	    	      {
	    	                 Option.click();
	    	                 break;
	    	      }
	       }
	       
	       /// How to handle check boxes ////////
	                
	       driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).click();
	        // verify wheteher the checkbox is clicked or not below lnine/////
	       
	       System.out.println(driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).isSelected());
	       
	       
	                            ///// Using Assertion ////////
	       Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_f')]")).isSelected());
	       
	       // Verify the count of Check boxes present in the page ///
	      System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//	   type sysout + ctrl and hit space); short for sopln
	      
	        
	        
	        }
	
	         
	
	        public static void staticmethodtest()
	       {
	     	System.out.println("I will do it dont stop");
	     	
	       }
	        
	        
	
	                               
	
	

}
