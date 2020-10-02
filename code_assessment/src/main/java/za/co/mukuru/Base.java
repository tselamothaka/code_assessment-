package za.co.mukuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base 
{
	//Creating a driver object referencing WebDriver interface
	public WebDriver driver;
	
	Actions action;
	protected String url = "http://automationpractice.com/index.php";
	
	public void openChromeBrowser()
	{
		   
       //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
     
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.get(url);
        //Using get() method to open a webpage
        
        
        //maximize the window
        driver.manage().window().maximize();
	}
	
	public void closeDriver()
	{
        //Closing the browser
        driver.quit();
	}
	
}
