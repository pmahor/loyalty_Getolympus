package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.Dataproviderfactory;
import pages.LoginPage;

public class VerifyLoginPage 
{
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeTest(description="This test case will verify Login Page")
	public void SetUp()
	{
		driver= BrowserFactory.getBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		loginpage=PageFactory.initElements(driver,LoginPage.class);
		
	}
	
	@Test(priority=1)
	public void clickolog()
	{
		loginpage.clickonlogin();
		
	}
	
	@Test(priority=2)
	public void VerifyLoginPage()
	{
				
		loginpage.Logintodashboard(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,1));	
	}
	 
	@Test(priority=3)
	public void logoutds()
	{
		loginpage.logout();
	}
	
	
	@Test(priority=4)
	public void verifyFBlogin()
	{	
		loginpage.FBsociallogin(Dataproviderfactory.getExceldata().getStringData(1,0),Dataproviderfactory.getExceldata().getStringData(1,1));			
	}

	
	@AfterTest
	public void teardown()
	{
		BrowserFactory.closeBrowser();
	}

	
	

}
