package swan.genericlib;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
      //On test failure the control will also come here (Listeners as well as here) and w have to tell whether we want to rerun the test or not .
      // also we can tell how many times the tes needed to be rerun.
public class RetryTest implements IRetryAnalyzer
{
    int count = 0;
    int maxTry = 1;                                //Video no 179
	@Override            
	public boolean retry(ITestResult result) 
	
	{
	   
		if(count<maxTry)                          //  <Less than 
		{   
			count++;
			return true;
			
		}
		return false;
		
		
		
	}

}
	
	// to retry all the failed test cases we can add it in the test ng xml file in the listeenser but 
	// in this case it wil run all the failed test cases 
	// How to run a particular test cases for ex i want to retry only logijn logout to be retry 
	// in this case you have to go to that tes  an 
	 
	
	// buit what where we used like Test   - @Test (dataProvider="CampaignData") How to use here ??? 
	                                  //     - @Test(dependsOnMethods= {"CreatingCampaign"})

//ANSWER OF LINE 36 =      @Test(dataProvider = "xyz", retryAnalyzer = Retry.class) 

                         // @Test(dependsOnMethods = "dependentMethod", retryAnalyzer = Retry.class)




