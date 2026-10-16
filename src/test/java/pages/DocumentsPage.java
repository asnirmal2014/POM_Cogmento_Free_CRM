package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DocumentsPage 
{
	public WebDriver driver = null;
	   
    public DocumentsPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    @FindBy(how=How.XPATH, using="//a[@href='/documents/new']") WebElement createbtnhyplink;
    @FindBy(how=How.XPATH, using="//i[@class='cancel icon']") WebElement cancelbtn;
    
    
    public void createbtnhyplink_click()
	{
    	createbtnhyplink.click();
	}
    
    public void cancelbtn_click()
	{
    	cancelbtn.click();
	}
}


