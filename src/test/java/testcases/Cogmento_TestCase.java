package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CalendarPage;
import pages.CampaignsPage;
import pages.ContactsPage;
import pages.DocumentsPage;
import pages.FormsPage;
import pages.HomePage;
import pages.LoginPage;
import utility.BaseClass;

public class Cogmento_TestCase extends BaseClass
{
   @Test
   public void init() throws InterruptedException
   {
	   //LoginPage loginPage = new LoginPage(null);
	   //PageFactory.initElements(driver, loginPage);

	   LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
       loginPage.setUserName("snka2018@gmail.com");
       loginPage.setPassword("Test12345");
       loginPage.clickOnLoginButton();
       Thread.sleep(3000);
       
       // Add this line:
       hideOneSignalBell();   // or ((BaseClass)this).hideOneSignalBell() if not inherited properly
       
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);
       homePage.clickOnCalendarIcon(); 
       Thread.sleep(3000);
       
       CalendarPage calPage = PageFactory.initElements(driver, CalendarPage.class);
	   calPage.createbtnhyplink_click();
	   Thread.sleep(3000);
		
	   calPage.cancelbtn_click();
   	   Thread.sleep(3000);
	   
	   homePage.clickOncontactsIcon();
	   Thread.sleep(3000);
	   
	   ContactsPage contactsPage = PageFactory.initElements(driver, ContactsPage.class);
	   contactsPage.createbtnhyplink_click();
	   Thread.sleep(3000);

	   //contactsPage.cancelbtnhyplink_contacts_click();
	   //Thread.sleep(3000);
	   
	   contactsPage.first_name_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.last_name_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.channel_type_click();
	   Thread.sleep(3000);
	   
	   contactsPage.channel_type_optionsselect();
	   Thread.sleep(5000);
	   
	   contactsPage.facebook_profile_link_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.street_address_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.city();
	   Thread.sleep(3000);
	   
	   contactsPage.state();
	   Thread.sleep(3000);
	   
	   contactsPage.postal_code();
	   Thread.sleep(3000);
	   
	   contactsPage.address_country_dropdown_select();
	   Thread.sleep(3000);
	   
	   contactsPage.address_country_dropdown_optionsselect();
	   Thread.sleep(5000);
	   
	   contactsPage.position_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.source_select();
	   Thread.sleep(3000);
	   
	   contactsPage.source_optionsselect();
	   Thread.sleep(3000);
	   
	   contactsPage.dnc();
	   Thread.sleep(3000);
	   
	   contactsPage.dne();
	   Thread.sleep(3000);
	   
	   contactsPage.dnt();
	   Thread.sleep(3000);
	   
	   contactsPage.identifier_txt_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.company_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.tags_txt_sendKeys();
	   Thread.sleep(3000);
	   
	   contactsPage.description_txt_sendKeys();
	   Thread.sleep(3000);
	   
	   /*
	   contactsPage.timezone_select();
	   Thread.sleep(3000);
	   
	   contactsPage.timezone_optionsselect();
	   Thread.sleep(3000);
	   */
	   
	   contactsPage.img_file_upload_sendKeys();
	   Thread.sleep(5000);

	   homePage.documentsIcon();
	   Thread.sleep(3000);
	   
	   DocumentsPage documentsPage = PageFactory.initElements(driver, DocumentsPage.class);
	   documentsPage.createbtnhyplink_click();
	   Thread.sleep(3000);
	   
	   documentsPage.cancelbtn_click();
	   Thread.sleep(3000);
	   
	   homePage.campaignsIcon();
	   Thread.sleep(3000);
	   
	   CampaignsPage campaignsPage = PageFactory.initElements(driver, CampaignsPage.class);
	   campaignsPage.createbtnhyplink_click();
	   Thread.sleep(3000);
	   
	   campaignsPage.cancelbtn_click();
	   Thread.sleep(3000);
	   
	   homePage.formsIcon();
	   Thread.sleep(3000);
	   
	   FormsPage formsPage = PageFactory.initElements(driver, FormsPage.class);
	   formsPage.createbtnhyplink_click();
	   Thread.sleep(3000);
	   
	   formsPage.cancelbtn_click();
	   Thread.sleep(3000);
	   
	   formsPage.createbtnhyplink_click();
	   Thread.sleep(3000);
	   
	   formsPage.name_sendKeys();
	   Thread.sleep(3000);
	   
	   homePage.homeIcon();               // Home Icon
	   Thread.sleep(3000);
	   
	   homePage.clickOnsettingsiconbtn(); // Settings Icon
	   Thread.sleep(3000);
	   
	   homePage.clickOnpowericon();       // LogOut Button
	   Thread.sleep(3000);
       
	   /*
       Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
       
       dashboard.clickOnProfile();
       Thread.sleep(3000);
       dashboard.clickOnProfileLogOut();
       Thread.sleep(3000);
       */       
   }
}

