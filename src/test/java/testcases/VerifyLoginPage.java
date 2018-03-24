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
import pages.DashboardPage;
import pages.LoginPage;

public class VerifyLoginPage 
{
	WebDriver driver;
	LoginPage loginpage;
	VerifyDashboardpage dashpage2;
	
	@BeforeTest(description="This test case will verify Login Page")
	public void SetUp()
	{
		driver= BrowserFactory.getBrowser("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get(Dataproviderfactory.getConfig().getUrl());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		loginpage=PageFactory.initElements(driver,LoginPage.class);
		
		//for verify dashboard page to create object
		dashpage2= new VerifyDashboardpage(driver);
		
	}
	
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
	}
	 
	
	
	/*@Test(priority=2)
	public void verifyFBlogin()
	{	
		loginpage.FBsociallogin(Dataproviderfactory.getExceldata().getStringData(1,0),Dataproviderfactory.getExceldata().getStringData(1,1));			
		loginpage.logout();
	}*/
	
	
	
	
	
	
	/*@Test(priority=2)
	public void verifyGmaillogin()
	{
		loginpage.Gplussociallogin(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,2));
		
	}*/
	/*
	@Test(priority=3)
	public void verifyamazonlogin()
	{
		loginpage.Amazonsociallogin(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,1));
		loginpage.logout();
	}
	
	@Test(priority=4)
	public void verifypaypallogin()
	{
		loginpage.Paypalsociallogin(Dataproviderfactory.getExceldata().getStringData(0,0),Dataproviderfactory.getExceldata().getStringData(0,3));
	}*/
	
	@AfterTest
	public void teardown()
	{
		BrowserFactory.closeBrowser();
	}

	
	

}
