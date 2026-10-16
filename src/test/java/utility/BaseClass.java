package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;         // Deprecated
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

// BaseClass + BrowserFactory
public class BaseClass 
{
    public static WebDriver driver = null;
    
    @BeforeSuite
    public void initialize() throws IOException, InterruptedException
    {
    	/*  OLD TECHNIQUE-1 */
	    /*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	
		System.setProperty("webdriver.gecko.driver", "C:/jars_selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", "C:/jars_selenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	    */
		
		/*  OLD TECHNIQUE-2 */
		/*
		WebDriverManager.chromedriver().setup();                      // 4.4.3
    	WebDriver driver = new ChromeDriver();
    	[OR]
    	WebDriver driver = WebDriverManager.chromedriver().create();  // 5.9.1
    	*/
				
		// [OR]
				
		/*
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(true);
			WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();  // 5.1.1
		*/	
				
		/*
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(false);
			WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();  // 5.1.1
		*/
		
		/*
			ChromeOptions options = new ChromeOptions();
			Map<String, Integer> prefs = new HashMap<String, Integer>();
			prefs.put("profile.default_content_setting_values.notifications", 0);  // 0-Ask(Default), 1-Allow, 2-Block
			options.setExperimentalOption("prefs", prefs);
			// options.addArguments("disable-notifications"); // To disable the notifications based permission popup
    		// options.addArguments("disable-geolocation");   // To disable the location based permission popup
    		// options.addArguments("disable-media-stream");  // To disable the microphone or camera based permission popup
			System.setProperty("webdriver.chrome.driver", "C:/jars_selenium/drivers/chromedriver.exe");
			driver = new ChromeDriver(options);
        */

    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");  // To disable the notifications based permission popup
    	driver = new ChromeDriver(options);
    	
    	//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		//driver = new SafariDriver();
		//driver = new InternetExplorerDriver();
		//driver = new OperaDriver();            // Deprecated
    	driver.manage().window().maximize();
    	driver.manage().window().setSize(new Dimension(1920, 1080));  // or larger if needed
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
	    driver.manage().deleteAllCookies();
    	
    	driver.get("https://ui.cogmento.com/");
    	//Thread.sleep(5000);
    }
    
    @AfterSuite
    public void tearDownTest() throws InterruptedException, IOException
    {
    	Thread.sleep(3000);
    	
		// driver.close();  // Close the current window, quitting the browser if it's the last window currently open.

		// driver.quit();   // Quits this driver, closing every associated window. Closes all the windows which are currently open.
        
    	// driver.close();  // Will not work in Selenium 4.0

    	// driver.quit();   // Will not work in Selenium 4.0
    			
    	// System.out.println("Press 'ENTER' Key in the Console to close the web browser");
    			
    	// System.in.read();   // Press 'ENTER' Key in the Console to close the web browser.					
    			
    	// System.in.read();   // Press 'ENTER' Key in the Console to close the web browser.
    	// Returns ASCII Value of 1st Character
    			
    	// driver.quit();
    	
    	if (driver != null)
    	{
            driver.quit();           // ← preferred
            // driver = null;        // optional but good practice
        }
    }
    
    // Add this helper method in BaseClass.java (or a new Utilities.java class):
    public void hideOneSignalBell() 
    {
        try 
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // Hide container + remove SVG (covers most OneSignal implementations)
            js.executeScript(
                "var containers = document.querySelectorAll('.onesignal-bell-container, .OneSignal-bell');" +
                "containers.forEach(el => { if (el) el.style.display = 'none'; });" +
                "var bells = document.querySelectorAll('.onesignal-bell-svg');" +
                "bells.forEach(el => { if (el) el.remove(); });"
            );
        } 
        catch (Exception ignored) 
        {
            // Bell might not be loaded yet → silent fail is fine
        }
    }
}

