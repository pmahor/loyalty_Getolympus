package pages;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Dataproviderfactory;

public class LoginPage
{
	
	WebDriver driver;
	
	@FindBy(id="email") WebElement emailaddr;
	@FindBy(id="pass") WebElement passwd;
	@FindBy(id="send2") WebElement submitbtn;
	@FindBy(xpath="//li[@class='error-msg']") WebElement errormsg;
	
	//FB social login elements
	@FindBy(xpath="//a[@id='s13_reg_fb']") WebElement fbbutton;
	@FindBy(xpath="//input[@id='email']") WebElement fbemailaddr;
	@FindBy(xpath="//input[@id='pass']") WebElement fbpasswd;
	@FindBy(xpath="//input[@id='u_0_0']") WebElement fbloginbtn;
	
	// add
	@FindBy(xpath="//a[@class='topeka-element-close topeka-close']") WebElement closebtn;
	
	//LogoutPAge
	@FindBy(xpath="//a[@class='skip-link skip-account logged-in']") WebElement logoutlink;
	@FindBy(xpath="//*[@id='header-account']/div/ul/li[1]/a") WebElement logoutbtn;
	
	//Login
	
	@FindBy(xpath="//a[@class='skip-link skip-account']") WebElement loginlink;
	@FindBy(xpath="//*[@id='header-account']/div/ul/li/a") WebElement loginbtn;
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void clickonlogin()
	{
		try 
		{
			
			Thread.sleep(5000);
			loginlink.click();
			Thread.sleep(5000);
			loginbtn.click();	
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Logintodashboard(String emailid, String pwd) 
	{		
		System.out.println("1Title"+driver.getTitle());
		emailaddr.sendKeys(emailid);
		passwd.sendKeys(pwd);
		submitbtn.click();
		
		System.out.println("Logged in successfully");		
		try
		{
			Thread.sleep(8000);	
			System.out.println("2Title"+driver.getTitle());
			closebtn.click();
			
			Thread.sleep(5000);
			
						
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : driver.getWindowHandles())
			{
				
				driver.switchTo().window(winHandl);
				
			}
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("3Title"+driver.getTitle());
		
	}
	
	public void FBsociallogin(String fbemail, String fbpwd)
	{
		try 
		{
			Thread.sleep(10000);	
			closebtn.click();
			Thread.sleep(5000);
			fbbutton.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				
				driver.switchTo().window(winHandl);
			}
			
			Thread.sleep(5000);
			fbemailaddr.sendKeys(fbemail);
			fbpasswd.sendKeys(fbpwd);
			fbloginbtn.click();
			
			System.out.println("Facebook login successfully");
			Thread.sleep(8000);
			
			/*System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentwindow);
			closebtn.click();
			System.out.println(driver.getTitle());
					*/
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
				
	}
	
	public void logout()
	{
		try 
		{			
			Thread.sleep(30000);
			
			logoutlink.click();
			logoutbtn.click();
			
			Thread.sleep(20000);
			loginlink.click();
			loginbtn.click();
			
			
			
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@FindBy(xpath="//a[@id='s13_reg_gl']") WebElement gmailbtn;
	@FindBy(xpath="//input[@id='identifierId']") WebElement gemailadd;
//	@FindBy(xpath="//*[@id='identifierNext']/content/span") WebElement nextbtn1;
	@FindBy(xpath="/html/head/body/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/div/div/div/content/span") WebElement nextbtn1;
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']") WebElement epass;
	@FindBy(xpath="//span[contains(.,'Next')]") WebElement nextbtn2;
	//*[@id="identifierNext"]/content/span
	
	

	
	public void Gplussociallogin(String emadd, String Passd)
	{
	
		try 
		{
			Thread.sleep(10000);
			closebtn.click();
			Thread.sleep(5000);
			gmailbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				
				driver.switchTo().window(winHandl);
			}
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			gemailadd.sendKeys(emadd);
			Thread.sleep(5000);
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", nextbtn1);
			
			//nextbtn1.click();
			epass.sendKeys(Passd);
			nextbtn2.click();
			
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	@FindBy(xpath="//a[@id='s13_reg_am']") WebElement amazonbtn;
	@FindBy(xpath="//input[@id='ap_email']") WebElement amazEmailaddr;
	@FindBy(xpath="//input[@id='ap_password']") WebElement amazpasswd;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement amazsubmitbtn;
	
	public void Amazonsociallogin(String amazemail, String amazpass)
	{
		try 
		{
			/*Thread.sleep(10000);
			closebtn.click();*/
			Thread.sleep(5000);
			amazonbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				
				driver.switchTo().window(winHandl);
			}
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			amazEmailaddr.sendKeys(amazemail);
			amazpasswd.sendKeys(amazpass);
			Thread.sleep(5000);
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", amazsubmitbtn);
			
			System.out.println("Amazon Loggedin successfully");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
			
			
		
	}
	
	
	@FindBy(xpath="//a[@id='s13_reg_pp']") WebElement paypalbtn;
	@FindBy(xpath="//input[@id='email']") WebElement paypalmailaddr;
	@FindBy(xpath="//button[@id='btnNext']") WebElement paypalnextbtn1;
	@FindBy(xpath="//input[@id='password']") WebElement paypalpasswd;
	@FindBy(xpath="//button[@id='btnLogin']") WebElement Paypalloginbtn;
	
	public void Paypalsociallogin(String pemail, String ppasswd)
	{
		try 
		{
			/*Thread.sleep(10000);
			closebtn.click();*/
			Thread.sleep(5000);
			paypalbtn.click();
			
			String parentwindow=driver.getWindowHandle();
			Set<String> winHandles=driver.getWindowHandles();
			for(String winHandl : winHandles)
			{
				
				driver.switchTo().window(winHandl);
			}
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			paypalmailaddr.sendKeys(pemail);
			
			Thread.sleep(5000);
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", paypalnextbtn1);
			
			paypalpasswd.sendKeys(ppasswd);
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click()", Paypalloginbtn);
			
			System.out.println("Paypal Loggedin successfully");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

	
	public String captureerrormsg()
	{
		String errmsg=errormsg.getText();
		return errmsg;
	}
	
			
}
