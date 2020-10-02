package za.co.mukurucontactustest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contactustest {
	
	
	public void contactustest()
	{
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	WebElement inputSearch;
    //Instantiating driver object
    driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
	 Select select = new Select (driver.findElement(By.id("id_contact")));
   select.selectByIndex(1);
	
   
   inputSearch = driver.findElement(By.xpath("//*[@id=\"message\"]"));
   
   
   inputSearch.sendKeys("my name is Tsela");
   inputSearch = driver.findElement(By.xpath("//*[@id=\"email\"]"));
   inputSearch.sendKeys("test@gmail.com");
  
   
   driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click(); 
   
   driver.navigate().refresh();
   inputSearch = driver.findElement(By.xpath("//*[@id=\"message\"]"));
   inputSearch.clear();
   driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
   
 //driver.wait(1000);
 		driver.quit();
	}
}
