package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CampaignsPage 
{
	public WebDriver driver = null;
	   
    public CampaignsPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    //@FindBy(how=How.XPATH, using="//a[@href='/calendar/new']") WebElement createbtnhyplink;
    //@FindBy(how=How.XPATH, using="//i[@class='cancel icon']") WebElement cancelbtn;
    
    @FindBy(how=How.XPATH, using="//button[normalize-space()='Create']") WebElement createbtnhyplink_campaigns;
    @FindBy(how=How.XPATH, using="//button[normalize-space()='Cancel']") WebElement cancelbtnhyplink_campaigns;
    
    public void createbtnhyplink_click()
	{
    	createbtnhyplink_campaigns.click();
	}
    
    public void cancelbtn_click()
	{
    	cancelbtnhyplink_campaigns.click();
	}
}


