package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{
	public WebDriver driver = null;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
/*
    Refer CLASS_NAME selector in Selenium document 	
    @FindBy(how = How.CLASS_NAME, using="//i[@class='calendar icon']") WebElement calIcon; 
*/
	@FindBy(how = How.XPATH, using="//i[@class='calendar icon']") WebElement calIcon;
	@FindBy(how = How.XPATH, using="//i[@class='users icon']") WebElement contactsicon;
	// @FindBy(how = How.XPATH, using="//i[@aria-hidden='true' and @class='settings icon']") WebElement settingsiconbtn;
	@FindBy(how = How.XPATH, using="//body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@id='top-header-menu']/div[@class='right menu']/div[@class='ui buttons']/div[@role='listbox']/i[1]") WebElement settingsiconbtn;
	@FindBy(how = How.XPATH, using="//i[@class='power icon']") WebElement powericon;
	@FindBy(how = How.XPATH, using="//div[@class='menu-item-wrapper']//span[normalize-space()='Campaigns']") WebElement campaignsIcon;
	@FindBy(how = How.XPATH, using="//div[@class='menu-item-wrapper']//span[normalize-space()='Documents']") WebElement documentsIcon;
	@FindBy(how = How.XPATH, using="//div[@class='menu-item-wrapper']//span[normalize-space()='Forms']") WebElement formsIcon;
	@FindBy(how = How.XPATH, using="//div[@class='menu-item-wrapper']//span[normalize-space()='Home']") WebElement homeIcon;

	
	
	public void clickOnCalendarIcon()
	{
		calIcon.click();
	}
	
	public void clickOncontactsIcon()
	{
		contactsicon.click();
	}
	
	public void clickOnsettingsiconbtn()
	{
		settingsiconbtn.click();
	}

	public void clickOnpowericon()
	{
		powericon.click();
	}

	public void documentsIcon()
	{
		// documentsIcon.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", documentsIcon);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", documentsIcon);
	}

	public void campaignsIcon()
	{
		// campaignsIcon.click();  // Original line present in the project already.
		
		// These codes are newly added.
		// Optional: scroll to make sure it's in view
	    // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", campaignsIcon);

	    // Click via JavaScript → ignores overlays / z-index issues
	    // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", campaignsIcon);
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", campaignsIcon);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", campaignsIcon);
	}
	
	public void formsIcon()
	{
		// formsIcon.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", formsIcon);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", formsIcon);
	}

	public void homeIcon()
	{
		// homeIcon.click(); // Original line present in the project already.
		
		// These codes are newly added.
		// Scroll the element into view (center it to avoid edge issues)
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", homeIcon);

	    // Force click via JavaScript
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", homeIcon);
	}
	
	/*
	public void clickOnProfileLogOut() 
	{ 
		profilelogout.click(); 
	}
	*/ 
}
