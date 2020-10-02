package za.co.mukurumenutest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import za.co.mukurusearchtest.Searchtest;

public class Menutest{
	
	private WebDriver driver;

	public void menutest() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		     
	        //Instantiating driver object
	        driver = new ChromeDriver();
	        driver.get("http://automationpractice.com/index.php");
	        //Using get() method to open a webpage
	        
	        //maximize the window
	        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		//driver.wait(1000);
		driver.quit();
		
	}
	}
	
