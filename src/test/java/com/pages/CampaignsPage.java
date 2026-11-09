package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
In Selenium, Page Files (more precisely, Page Object Model / Page Object Classes) are files where 
you store the web elements and actions of a web page in a separate class, rather than 
writing them directly inside your test scripts.
*/
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
