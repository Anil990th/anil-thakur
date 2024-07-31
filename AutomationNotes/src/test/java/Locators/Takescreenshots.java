package Locators;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
@Test
public class Takescreenshots {

	public static void main(String[] args) throws IOException
	{
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://google.com");
	    
     File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(src,new File("C:\\Users\\Dell\\screenshot.png"));
	    

	}

}
                                 ///// Explanation /////

   //1 - first you need to cast  the driver cat means telling driver that you need to take the screenshot ( Line no 22)
   //  string the driver in a file named src ( line no 22)
  // 2- using file util method to store the scrfeenshot in my comp location 
