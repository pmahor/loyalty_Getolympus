package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import pages.DashboardPage;
import pages.LoginPage;
import utility.Library;

public class VerifyDashboardpage
{
	WebDriver driver;
	DashboardPage dashpage;
	Library scrshotobj;
	LoginPage loginpage;
	
	@Parameters("browser")
	@BeforeTest(description="This test case will verify Login Page")
	public void SetUp(String browser)
	{
		driver= BrowserFactory.getBrowser(browser);
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dashpage=PageFactory.initElements(driver,DashboardPage.class);
		scrshotobj=PageFactory.initElements(driver,Library.class);
		loginpage=PageFactory.initElements(driver,LoginPage.class);
	}
	
	
	/*public VerifyDashboardpage(WebDriver driver)
	{
		this.driver=driver;
		
		dashpage=PageFactory.initElements(driver,DashboardPage.class);
		scrshotobj=PageFactory.initElements(driver,Library.class);
		loginpage=PageFactory.initElements(driver,LoginPage.class);
	}*/
	
	@Test(priority=1)
	public void clickolog()
	{
		loginpage.clickonlogin();
	}
	
	
	@Test(priority=2)
	public void VerifydasboardLogin()
	{		
		loginpage.Logintodashboard(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,1));	
		//loginpage.logout();
		System.out.println("logged in successfully");
	}
	 
		
	@Test(priority=3)
	public void verifyLoyaltyDshboard()
	{
		try 
		{			
			Thread.sleep(5000);
			dashpage.Dashobard();
			Thread.sleep(5000);
			scrshotobj.takescreensnap(driver, "verifyLoyaltyDshboard");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	//@FindBy(xpath="//iframe[@id='s15-dashboard-iframe']") WebElement iframe1;
	
	@Test(priority=4)
	public void verifyEarnpoint()
	{
		try 
		{			
			Thread.sleep(8000);
			int iframesize = driver.findElements(By.tagName("iframe")).size();
			System.out.println("Iframe size="+iframesize);
			driver.switchTo().frame("s15-dashboard-iframe");
			System.out.println("Ready to Clicked on Earn point tab");
			dashpage.EarnpointTab();
			System.out.println("Clicked on Earn point tab");
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
