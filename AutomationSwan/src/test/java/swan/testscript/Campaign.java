package swan.testscript;

import org.testng.annotations.Test;

import swan.elementRepo.CreateCampaignModule;
import swan.elementRepo.EditCampaign;
import swan.genericlib.BaseClass;

public class Campaign extends BaseClass
{
    
	@Test
	public void CreatingCampaign() throws InterruptedException 
	{
	
		CreateCampaignModule cr = new CreateCampaignModule(driver);
		cr.createcampaignf("Test 01","Summ","1","7","50","40","100","Hey user grab the offer now","offer valid for payment above 5000");
		
	}
	
	@Test(dependsOnMethods= {"CreatingCampaign"})
	public void EditingCampaign()
	{
		
		
		EditCampaign ed = new EditCampaign(driver);
		ed.editingthecampaign();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
