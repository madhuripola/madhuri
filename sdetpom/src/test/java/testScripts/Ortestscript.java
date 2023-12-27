package testScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orpages1.OrLoginpage;
import orpages1.OrSystemusers;
import orpages1.Ordashboard;
import orpages1.Orutility;

public class Ortestscript {
	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		Orutility ou=new Orutility(driver);
		OrLoginpage olp=new OrLoginpage(driver);
		Ordashboard odp=new Ordashboard(driver);
		OrSystemusers os=new OrSystemusers(driver);
		ou.launchorloginpage();
		Thread.sleep(3000);
		ou.maximizeor();
		Thread.sleep(3000);
		olp.enterusername();
		Thread.sleep(3000);
		olp.enterpws();
		Thread.sleep(3000);
		olp.clicklogin();
		Thread.sleep(3000);
		odp.clickpim();
	Thread.sleep(3000);
		os.clickonempname();
		Thread.sleep(3000);
		os.goTOFC();
		Thread.sleep(3000);
		os.clickonsearch();
		Thread.sleep(3000);
		
		ou.teardown();
		
		
	}
}
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

