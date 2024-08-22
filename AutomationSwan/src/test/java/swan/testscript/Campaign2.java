package swan.testscript;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import swan.elementRepo.CreateCampaignModule;
import swan.elementRepo.EditCampaign;
import swan.genericlib.BaseClass;
import swan.genericlib.RetryTest;

public class Campaign2 extends BaseClass
{                                                                       //  How to use retry mechanisum with different annotations see belowlin2
	                                                                    // @Test (dataProvider = "CampaignData" , retryAnalyzer=RetryTest.class)
    
	@Test (dataProvider = "CampaignData")  //TELLING THIS METHOD THAT FROW WHERE IT HAS TO TAKE THE DATA
	public void CreatingCampaign(HashMap<String,String>input) throws InterruptedException 
	{                //Step03           //(HashMap<String,String>input)in above line whats is this ,  here we are telling to the method that we are going to receie hashmaps             
	                                          //Why StringString in aboe line this is just beause in elements.repo methos we said that it will aaept strings
		CreateCampaignModule cr = new CreateCampaignModule(driver);
		cr.createcampaignf(input.get("Campaignname"),input.get("entercouponcode"),input.get("StartDate"),input.get("enddate"),input.get("discount"),input.get("threshold"),input.get("maxdiscount"),input.get("description"),input.get("termsandconditions"));
		                 //Step04-getiing the value that ypu want by using input.get which is a hashmapfeature
		                 //continuation of above-why input check line no 16
	}
	
	
	@DataProvider       // Step01// by using this annotation our main method will know that data will come from this method
	public Object [][] CampaignData()   //Why public Object here beause in line no 72 we are returning Objet Data Type and why[][] these beause with onjet we are also returning two dim array
	{
	
		HashMap<String,String> map01 = new HashMap<String,String>();  //Syntax of creating onjet of hashmap which is a class so that we can use the methods present in Hashmap class
		map01.put("Campaignname","Dataprovidertests");  //in swan.elements repo - creatingCampaigModule  ---you need to give data types and their namaes in method like String[campaignname],String[entercouponcode] etc only then you can use the Hashmaps here
		map01.put("entercouponcode","MAXX");
		map01.put("StartDate","1");
		map01.put("enddate", "7");
		map01.put("discount","50");
		map01.put("threshold", "40");
		map01.put("maxdiscount", "100");
		map01.put("description","Grab it now");
		map01.put("termsandconditions", "Valid only for today");
		
		
		
		return new Object [][] { {map01} };    //Step2// create a two dimemtional array as shown
		
		                                                        //  above Line [][] these symbol shows two dimentional array
	
		//in Line 72 nuber of curley braces = number of data sets you want the test to run with 
		//in Line no 72 what is object there , we can make it String,int,decial,int etc basically its a data type , we used objet beause it  accept all kind of data so its easy to use
		
	}
	
	
	
	
	
	
	
}
