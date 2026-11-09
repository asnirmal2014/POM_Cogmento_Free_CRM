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
public class LoginPage 
{
    public WebDriver driver = null;
   
    public LoginPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    /*
	public LoginPage(WebDriver driver) 
	{
        this.driver = driver;
    
		// LoginPage loginPage = PageFactory.initElements(driver, Login_Page.class); // initialize this page's elements
		// [ OR ]
		// PageFactory.initElements(driver, this);                                   // initialize this page's elements
    }
	*/
    
    //@FindBy(how = How.NAME, using = "email") WebElement e;
    //@FindBy(how = How.NAME, using = "password") WebElement pwd;
    
    //@FindBy(how=How.XPATH,using="//input[@name='email']") WebElement e;
    //@FindBy(how=How.XPATH,using="//input[@name='password']") WebElement pwd;
    
    @FindBy(how=How.XPATH,using="//div[@class='ui left icon input']/input[@name='email']") WebElement e;
    @FindBy(how=How.XPATH,using="//input[@name='password']") WebElement pwd;
    @FindBy(how = How.XPATH, using = "//div[@class='ui fluid large blue submit button']") WebElement lgnbtn;
    
    public void setUserName(String username)
    {
    	e.sendKeys(username);
    }
    
    public void setPassword(String password)
    {
    	pwd.sendKeys(password);
    }
    
    public void clickOnLoginButton()
    {
        lgnbtn.click();
    }
}