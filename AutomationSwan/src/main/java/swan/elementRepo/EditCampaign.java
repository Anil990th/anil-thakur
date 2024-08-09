package swan.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCampaign 
{
	
	 WebDriver driver;
		public EditCampaign(WebDriver driver) 
		{
			
			this.driver=driver;
			PageFactory.initElements(driver,this); 
			
		}
		
		          // click create campaign sidebar 
					@FindBy(xpath="//span[text()='Create Campaigns']")
					WebElement createcampaignclick;
					
				// click on edit button 
					@FindBy(xpath="(//i[@id='actionsIcon'])[1]")
					WebElement clickonediticon;
					
					
					
					
					public void editingthecampaign() 
					
					{
						createcampaignclick.click();
						clickonediticon.click();
						
						
					}
	

}
