package practice2;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listener implements ITestListener {

	public static void main(String[] args)
	{
	

	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
	   System.out.println("Passed great work");

	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
	   System.out.println("I am Failed check me fast " +result.getName());

	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
	 //  System.out.println("Hey iam skipped " +result.getName());

	}
	
	@Override
	public void onFinish(ITestContext context)
	{
	//   System.out.println("Hey look here execution is finished ");

	}
	

	@Override
	public void onStart(ITestContext context)
	{
	//   System.out.println("Hey focus here execution starts  ");

	}
	
	
	

}
