package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage
{
	@FindBy(xpath="//*[@id='index-page']/body/div[2]/div/div[3]/div/div[1]/div/div[2]/ul/li[12]/a")
	WebElement Rewardlink;
	
	@FindBy(xpath="//*[@id='tabs']/li[2]/a")
	WebElement Earnpointlink;
	
	@FindBy(xpath="//*[@id='tabs']/li[3]/a")
	WebElement ManageRewardlink;
	
	@FindBy(xpath="//*[@id='isActive']")
	WebElement Activitylink;
	
	
	//*[@id="activitydata_filter"]/label/input
	public void	Dashobard()
	{
		Rewardlink.click();
	}
	
	public void EarnpointTab()
	{
		Earnpointlink.click();
	}
	
	public void ManagerewardTab()
	{
		ManageRewardlink.click();
	}

}
