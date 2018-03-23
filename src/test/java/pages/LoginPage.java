package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	@FindBy(xpath="//a[@class='skip-link skip-account logged-in skip-active']") WebElement logoutlink;
	@FindBy(xpath="//*[@id='header-account']/div/ul/li[1]/a") WebElement logoutbtn;
	
	//Login
	
	@FindBy(xpath="//a[@class='skip-link skip-account']") WebElement loginlink;
	@FindBy(xpath="//*[@id='header-account']/div/ul/li/a") WebElement loginbtn;
	
	//*[@id="header-account"]/div/ul/li/a
	
	
	
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
			for(String winHandl : driver.getWindowHandles())
			{
				
				driver.switchTo().window(winHandl);
			}
			
			Thread.sleep(5000);
			fbemailaddr.sendKeys(fbemail);
			fbpasswd.sendKeys(fbpwd);
			fbloginbtn.click();
			
			System.out.println("Facebook login successfully");
			Thread.sleep(8000);
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentwindow);
			closebtn.click();
			System.out.println(driver.getTitle());
					
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
			Thread.sleep(5000);
			
			logoutlink.click();
			logoutbtn.click();
			
			Thread.sleep(10000);
			loginlink.click();
			fbloginbtn.click();
			
			
			
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	public void Gplussociallogin()
	{
		
		
	}
	
	public void Amazonsociallogin()
	{
		
		
	}
	
	public void Paypalsociallogin()
	{
		
		
	}

	
	public String captureerrormsg()
	{
		String errmsg=errormsg.getText();
		return errmsg;
	}
	
			
}
