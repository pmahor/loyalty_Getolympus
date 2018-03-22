package factory;

import dataprovider.ReadConfig;
import dataprovider.ReadExcelData;

public class Dataproviderfactory 
{
	
	static ReadConfig config;
	static ReadExcelData excelr;
	
	public static ReadConfig getConfig()
	{
		
		config = new ReadConfig();
		
		return config;
		
	}
	
	public static ReadExcelData getExceldata()
	{
		excelr= new ReadExcelData();
		
		return excelr;
		
	}

}
