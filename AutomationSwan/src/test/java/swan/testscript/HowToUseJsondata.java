package swan.testscript;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import swan.elementRepo.CreateCampaignModule;
import swan.genericlib.BaseClass;
import swan.genericlib.DataReaderUtility;

public class HowToUseJsondata extends BaseClass
{
	
	@Test (dataProvider="CampaignData")
	public void CreatingCampaign(HashMap<String,String> input) throws InterruptedException 
	{
	
		CreateCampaignModule cr = new CreateCampaignModule(driver);
		cr.createcampaignf(input.get("CampaignName"),input.get("CouponCode"),input.get("StartDate"),input.get("EndDate"),input.get("Discount"),input.get("Threshold"),input.get("MaxDiscount"),input.get("Description"),input.get("Terms&Conditions"),input.get("CouponLabel"));
		
	}
	
	@DataProvider
	public Object[][] CampaignData() throws IOException   
	{

		DataReaderUtility d = new DataReaderUtility();//Creating object of the DataReaderUtility class so that we can use the methods present inside it
		                                              //you can also add the DataReaderUtility class in base class so then no need to create object but currently getting an error
		List<HashMap<String,String>> data = d.getJsonDataToHashmap(System.getProperty("user.dir")+ "//TestsDataFiles(JSON)//CreateCampaignData.json");
		                                                                              //just above is the path where your json file is present from which you want data- you have to create it.or devs will give you
	    return new Object[][] { {data.get(0)} ,{data.get(1)} }; //video no 173 from 14;58 secs
	}
	
	
	// line no 32 why List<HashMap<String,String>> is here beause getJsonDataToHashmap method returns list of hashmaps in the form of strings and we are storing that in an object called data
	//and your test will run baaaseed on number of data sets eg line no 32 has 2 sets so it will run 2 times and prepare json file accordingly
	
	// line no 34 why data.get(0) is there because it means fetch first {} braces data from jsonfile 
	
}
