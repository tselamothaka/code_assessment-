package za.co.mukurusearchtest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import za.co.mukuru.App;
import za.co.mukuru.Base;

public class Searchtest {

	App objApp = new App();
	private WebDriver driver;
	private Actions action;
	
	public void Searchtest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebElement inputSearch;
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
		
		inputSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		inputSearch.sendKeys("PRINTED DRESS");
		
		action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,1010)", "");
		
			
		
		inputSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		inputSearch.clear();
	    inputSearch.sendKeys("Cape town");
	    action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		//driver.wait(1000);
		driver.quit();
		
	}
}
