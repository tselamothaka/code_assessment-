package za.co.mukuru;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest 
{
	
	Base base = new Base();
	public void simpleTest()
	{
		Base base = new Base();
		//open the web app
		base.openChromeBrowser();
		//driver.get(url);
		//Assert.assertEquals("My Store", driver.getTitle());
	}
	
	public void closeBrowser()
	{
		base.closeDriver();
	}
}
