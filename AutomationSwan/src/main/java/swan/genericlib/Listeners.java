package swan.genericlib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener
{
	ExtentTest test;  // global variable test so that all the methopds can use it.
	ExtentReports ex = ExtentReporterNGUtility.getReportObject() ;   //static class ExtentReporterNG so we can call  method inside iot by using dot method name 
	                                                        //and it is returning ex thats why we have written ExtentReports ex =.
	
	ThreadLocal <ExtentTest> extentTest = new ThreadLocal <ExtentTest>();  //while running tests in parallel report generated is wrong to overcome that we wrote this line //video no 178
	
	public void onTestStart(ITestResult result)
	{
	   test =	ex.createTest(result.getMethod().getMethodName());  // test =	ex.createTest(result- this is done to create report enteries of the tests 
	  	                                                            //"result" have the knowledge of test which is running and also gives testname to which enteries has to be created
	   System.out.println(result.getMethod().getMethodName()+  " - Test Started");
	   extentTest.set(test);  //unique id for every testt//related to line no 20
	}

	public void onTestSuccess(ITestResult result) 
	{
		extentTest.get().log(Status.PASS,"Test Passed");
		System.out.println(result.getMethod().getMethodName()+  " - Test Passed");
	}

	public void onTestFailure(ITestResult result) 
	{
		
		extentTest.get().fail(result.getThrowable());  //with this we are getting the error due to which test is failed    ---//extentTest.get relatedtolineno27
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());  //giving driver knowledge to listeners little complicated see video no 177 6.50 sec
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} 
		
		
		
		String filePath = null;
		try {
			filePath = getScreenshot(result.getMethod().getMethodName(),driver);// Integrating Sreenshotcode whih is there in Base clas Eplanation video no177
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName()+  " - Test Failed");
		
		
	}
			
			
			
	
	public void onTestSkipped(ITestResult result) 
	{
		
		System.out.println(" skipped please check- " +result.getName());
	}
	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}
	

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) 
	{
		ex.flush();      //this will execute at last of the test and this means that now generate the reports .
		                // if we dont write thjis then all the test report enteries are created but it will not generate the report.
	}
	
}
