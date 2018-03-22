package unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

import factory.Dataproviderfactory;

public class DataProviderTest
{
	@Test
	public static void testconfig()
	{
		System.out.println("Testing config data");
		//ReadConfig obj = new ReadConfig();
		//String chromepath1 =obj.getChromePath();
		String chromepath1 = Dataproviderfactory.getConfig().getChromePath();
		System.out.println("Path"+chromepath1);
		
		Assert.assertEquals(chromepath1, "D:\\Pankaj BACKUP\\Selenium\\Workspace\\Refer_A_Friend_v5_BlindsGalore\\Resourses\\chromedriver.exe");
		System.out.println("Testing..........");
	}
	
	@Test
	public static void testexceldata()
	{
		System.out.println("Testing Excel data");
		String data1= Dataproviderfactory.getExceldata().getStringData(0,0);
		
		Assert.assertEquals(data1,"sa.johngrey@gmail.com");
		System.out.println("Testing..........");
	}
	

}
