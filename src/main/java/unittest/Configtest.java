package unittest;

import org.testng.annotations.Test;

import dataprovider.ReadConfig;

public class Configtest
{
	
	public class TestConfigReader {
		
		@Test
		public void testConfig(){
			
		 ReadConfig readConfigfile=new ReadConfig();
		
	     String ie_path=readConfigfile.getIEPath();   
	     System.out.println("IE Driver is located at "+ie_path);
		}
		
		
		@Test
		public void testConfig1(){
					
			 ReadConfig readConfigfile=new ReadConfig();
			
		     String chrome_path=readConfigfile.getChromePath();
		     
		     System.out.println("Chromed Driver is located at "+chrome_path);
			}

	}


}
