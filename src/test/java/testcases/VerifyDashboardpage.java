package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import utility.Library;

public class VerifyDashboardpage
{
	WebDriver driver;
	DashboardPage dashpage=PageFactory.initElements(driver,DashboardPage.class);
	Library scrshotobj=PageFactory.initElements(driver,Library.class);
	
	
	public VerifyDashboardpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test(priority=3)
	public void verifyLoyaltyDshboard()
	{
		try 
		{			
			Thread.sleep(5000);
			dashpage.Dashobard();
			scrshotobj.takescreensnap(driver, "verifyLoyaltyDshboard");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=4)
	public void verifyEarnpoint()
	{
		try 
		{			
			Thread.sleep(5000);
			dashpage.EarnpointTab();
			scrshotobj.takescreensnap(driver, "verifyEarnpoint");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=5)
	public void VerifyManangereward()
	{
		try 
		{			
			Thread.sleep(5000);
			dashpage.ManagerewardTab();
			scrshotobj.takescreensnap(driver, "VerifyManangereward");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
}
