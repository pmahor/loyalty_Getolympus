package unittest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BrowserFactory;

public class BrowserfactoryTest 
{
	@Test(description="This test will verify firefox Instance")
	public void IEBrowser(){
		
	WebDriver driver=BrowserFactory.getBrowser("IE");

	Assert.assertTrue(driver!=null);
	
	BrowserFactory.closeBrowser();
		
	}
	
	@Test(description="This test will verify Chrome Instance")
	public void testChromeBrowser(){
		
	WebDriver driver=BrowserFactory.getBrowser("Chrome");

	Assert.assertTrue(driver!=null);
	
	BrowserFactory.closeBrowser();
		
	}

}
