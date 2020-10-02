package za.co.mukuru;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import za.co.mukurucontactustest.Contactustest;
import za.co.mukurumenutest.Menutest;
import za.co.mukururegistrationtest.Registrationtest;
import za.co.mukurusearchtest.Searchtest;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	Menutest mn = new Menutest();
    	mn.menutest();
    	Searchtest search = new Searchtest();
    	search.Searchtest();
    	Contactustest contactustest = new Contactustest();
    	contactustest.contactustest();
    	Registrationtest registration = new Registrationtest();
    	registration.registrationtest();
    }
}
