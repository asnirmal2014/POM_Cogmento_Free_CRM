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
public class FormsPage 
{
	public WebDriver driver = null;
	   
    public FormsPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    @FindBy(how=How.XPATH, using="//a[@href='/forms/new']") WebElement createbtnhyplink;
    @FindBy(how=How.XPATH, using="//i[@class='cancel icon']") WebElement cancelbtn;
    @FindBy(how=How.XPATH, using="//div[@class='ui input']/child::input") WebElement name;
        
    public void createbtnhyplink_click()
	{
    	createbtnhyplink.click();
	}
    
    public void cancelbtn_click()
	{
    	cancelbtn.click();
	}
    
    public void name_sendKeys()
    {
    	name.clear();
    	name.sendKeys("QA_Forms");
    }
}
