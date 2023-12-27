package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orpages2.OrSystemusers;
import orpages2.Ordashbard;
import orpages2.Orlogin;
import orpages2.Orutility;

public class Ortestscript2 {
	
	public static void main(String[] args)throws Exception{
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	Orutility ou=new Orutility(driver);
	Orlogin olp=new Orlogin(driver);
	Ordashbard odp=new Ordashbard(driver);
	OrSystemusers os=new OrSystemusers(driver);
	ou.launchorloginpage();
	Thread.sleep(2000);
	
	ou.maximizeor();
	Thread.sleep(2000);
	olp.enterusername();
	Thread.sleep(2000);
	olp.enterpws();
	Thread.sleep(2000);
	olp.clicklogin();
	Thread.sleep(2000);
	odp.clickpim();
	Thread.sleep(2000);
	os.cliconempname();
	Thread.sleep(2000);
	os.gotoFP();
	Thread.sleep(3000);
	os.clickonsearch();
	Thread.sleep(6000);

	ou.teardown();
	}
}

	
	


