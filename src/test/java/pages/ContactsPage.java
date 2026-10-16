package pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactsPage 
{
	public WebDriver driver = null;
	
	public ContactsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Create']") WebElement createbtnhyplink_contacts;
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Cancel']") WebElement cancelbtnhyplink_contacts;
	@FindBy(how=How.XPATH, using="//input[@type='text' and @name='first_name']") WebElement first_name;
	@FindBy(how=How.XPATH, using="//input[@type='text' and @name='last_name']") WebElement last_name;
	@FindBy(how=How.XPATH, using="//div[@name='channel_type']") WebElement channel_type;
	@FindBy(how=How.XPATH, using="//input[@placeholder='Facebook profile link']") WebElement facebook_profile_link;
	@FindBy(how=How.XPATH, using="//input[@placeholder='Street Address']") WebElement street_address;
	@FindBy(how=How.XPATH, using="//input[@placeholder='City']") WebElement city;
	@FindBy(how=How.XPATH, using="//input[@placeholder='State / County']") WebElement state;
	@FindBy(how=How.XPATH, using="//input[@placeholder='Post Code']") WebElement postal_code;
	@FindBy(how=How.XPATH, using="//div[@class='three wide field']//div[@name='country']") WebElement address_country_dropdown_select;
	@FindBy(how=How.XPATH, using="//input[@name='position']") WebElement position;
	// @FindBy(how=How.XPATH, using="//div[@class='field']//div[@name='source']/div[1]") WebElement source_select;
    // [ OR ]
	@FindBy(how=How.XPATH, using="//div[@class='field']//div[@name='source']/div[normalize-space()='Select']") WebElement source_select;
	@FindBy(how=How.XPATH, using="//div[@class='ui toggle checkbox']//label[normalize-space()='Do not Call']") WebElement dnc;
	@FindBy(how=How.XPATH, using="//div[@class='ui toggle checkbox']//label[normalize-space()='Do not Email']") WebElement dne;
	@FindBy(how=How.XPATH, using="//div[@class='ui toggle checkbox']//label[normalize-space()='Do not Text']") WebElement dnt;
	@FindBy(how=How.XPATH, using="//input[@name='identifier']") WebElement identifier_txt;
	@FindBy(how=How.XPATH, using="//div[@name='company']//input[@type='text']") WebElement company;
	@FindBy(how=How.XPATH, using="//div[@class='ui fluid multiple search selection dropdown']//input[@class='search']") WebElement tags_txt;
	@FindBy(how=How.XPATH, using="//div[@class='ui field']//textarea[@name='description']") WebElement description_txt;
	@FindBy(how=How.XPATH, using="//div[@name='timezone']//input[@type='text']") WebElement timezone_select;
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Indian/Mahe')]") WebElement timezone_optionsselect;
	// @FindBy(how=How.XPATH, using="//input[@name='fileField' and  @type='file']") WebElement img_file_upload;
	@FindBy(how=How.XPATH, using="//input[@name='image']") WebElement img_file_upload;
	
	
	public void first_name_sendKeys()
	{
		first_name.clear();
		first_name.sendKeys("Nirmal");
	}
	
	public void last_name_sendKeys()
	{
		last_name.clear();
		last_name.sendKeys("Kumar");
	}
	
	/*
	public void cancelbtnhyplink_contacts_click()
	{
		cancelbtnhyplink_contacts.click();
	}
	*/
	
	public void createbtnhyplink_click()
	{
		createbtnhyplink_contacts.click();
	}
	
	/*
	WebElement element = driver.findElement(By.id("country"));
	Select sobj = new Select(element);
	List<WebElement> listobj = sobj.getOptions();
	*/

	public void channel_type_click()
	{
		channel_type.click();
	}
	
	public void channel_type_optionsselect()
	{
		//Select selobj = new Select(channel_type);
		//selobj.selectByVisibleText("Facebook");
		
		// new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectric-items']//li[contains(., 'Borrowing Capacity')]"))).click();
		// //*[@id="main-content"]/div/div[2]/form/div[5]/div[1]/div/div/div/div[1]/div/div[1]
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div/div[1]/div/div[1]"))).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='divider text'][text()='Facebook']"))).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='divider text' and normalize-space()='Facebook']"))).click();
		
		//div[@class='divider text' and normalize-space()='Facebook']
		//div[@class='visible menu transition']//div[2]
		
		//WebElement we = driver.findElement(By.xpath("//div[@class='divider text' and normalize-space()='Facebook']"));
		//we.click();
        
		WebElement we = driver.findElement(By.xpath("//div[@class='visible menu transition']//div[2]"));
		we.click();
	}
	
	public void facebook_profile_link_sendKeys()
	{
		facebook_profile_link.clear();
		facebook_profile_link.sendKeys("https://www.facebook.com");
	}
	
	// Street Address
	// City
	// State
	// Postal Code
	// Country

    public void street_address_sendKeys()	
    {
    	street_address.clear();
    	street_address.sendKeys("10, Krishi Bhawan");
    }
 
    public void city()	
    {
    	city.clear();
    	city.sendKeys("Delhi");
    }	
    
    public void state()	
    {
    	state.clear();
    	state.sendKeys("Delhi");
    }
    
    public void postal_code()
    {
    	postal_code.clear();
    	postal_code.sendKeys("110001");
    }
    
    public void address_country_dropdown_select()
    {
    	address_country_dropdown_select.click();
    }
	
	public void address_country_dropdown_optionsselect() 
	{ 
		WebElement we = driver.findElement(By.xpath("//div[@class='three wide field']//div[@name='country']//div[2]//i[@class='in flag']"));
	    we.click(); 
	}

	public void position_sendKeys()
	{
		position.sendKeys("QA");
	}
	
	// Supervisor
	
	// Referred By
	
	public void source_select()
	{
		source_select.click();
	}
	
	public void source_optionsselect()
	{
		WebElement we = driver.findElement(By.xpath("//div[@name='source']//div[normalize-space()='Google']"));
	    we.click();
	}
	
	public void dnc()
	{
		dnc.click();
	}
	
	public void dne()
	{
		dne.click();
	}
	
	public void dnt()
	{
		dnt.click();
	}
	
	public void identifier_txt_sendKeys()
	{
		identifier_txt.clear();
		identifier_txt.sendKeys("QA");
	}
	
	// Middle Name
	
	public void company_sendKeys()
	{
		company.clear();
		company.sendKeys("IBM");
	}
	
	public void tags_txt_sendKeys()
	{
		tags_txt.clear();
		tags_txt.sendKeys("QA");
	}
	
	public void description_txt_sendKeys()
	{
		description_txt.clear();
		description_txt.sendKeys("QA Description");
	}
	
	public void timezone_select()
	{
		timezone_select.click();
	}
	
    public void timezone_optionsselect()
    {
    	timezone_optionsselect.click();
    }
	
	public void img_file_upload_sendKeys()
	{
		/*
	    String path = System.getProperty("user.dir");                 // D:\eclipse-workspace-test\MVN_POM_TEST_14                  
		                                                              // D:\eclipse-workspace-test\MVN_POM_TEST_14\sampleimages\images\1.jpg
	    
		img_file_upload.sendKeys(path + "\\sampleimages\\images\\1.jpg");
		
		// img_file_upload.sendKeys("D:\\sampleimages\\images\\1.jpg");
		*/

		// img_file_upload.clear();
		
		img_file_upload.click();
		
		try 
		{
			Runtime.getRuntime().exec("D:\\eclipse-workspace-1\\MVN_POM_JENKINS_12\\autoitscripts\\cogmento_ContactsPage_fileupload_1.exe");
			
			//String path = System.getProperty("user.dir");                 // D:\eclipse-workspace-test\MVN_POM_TEST_13			
			
			//Runtime.getRuntime().exec(path + "autoit_exe_files\\UploadFile_cogmento_1.exe");
			
			//Runtime.getRuntime().exec("D:\\AutoIt_exe_files\\UploadFile.exe");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
