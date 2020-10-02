package za.co.mukururegistrationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationtest {

	public void registrationtest(){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	WebElement inputSearch;
    //Instantiating driver object
    driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    
    //Create an account
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    
    inputSearch = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
    inputSearch.sendKeys("tselamothaka@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
  
    WebElement Radiobutton = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
    Radiobutton.click();
  
    inputSearch = driver.findElement(By.id("customer_firstname"));
   inputSearch.sendKeys("Tsela");
    inputSearch = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
    inputSearch.sendKeys("Mothaka");
    inputSearch = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
    inputSearch.sendKeys("1234567890");
    
    Select select = new Select (driver.findElement(By.xpath("//*[@id=\"days\"]")));
    select.selectByIndex(19);
    select = new Select (driver.findElement(By.xpath("//*[@id=\"months\"]")));
    select.selectByIndex(2);
    select = new Select (driver.findElement(By.xpath("//*[@id=\"days\"]")));
    select.selectByVisibleText("1990");
    JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,1000)", "");
	inputSearch = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	inputSearch.sendKeys("Tsela");
	inputSearch = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
	inputSearch.sendKeys("Mothaka");
	inputSearch = driver.findElement(By.xpath("//*[@id=\"company\"]"));
	inputSearch.sendKeys("ACN");
  
	 executor = (JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,1000)", "");
	inputSearch = driver.findElement(By.xpath("//*[@id=\"city\"]"));
	inputSearch.sendKeys("Pretoria");
	 select = new Select (driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
	 select.selectByVisibleText("New York");
	
	inputSearch = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
	inputSearch.sendKeys("0001");
	
	inputSearch = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
	inputSearch.sendKeys("0987654321");
	
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	
}
}