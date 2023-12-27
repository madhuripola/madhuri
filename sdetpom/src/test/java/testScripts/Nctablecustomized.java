package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages1.NcDashboardendtoend;
import ncpages1.NcLoginpage;
import ncpages1.Ncproductstableendtoend;
import ncpages1.Ncutility;



public class Nctablecustomized {
	public static void main(String[] args)throws Exception {
	WebDriver driver = new ChromeDriver();	
	
	Ncutility nu=new Ncutility(driver);
	NcLoginpage nlp = new NcLoginpage(driver);
	NcDashboardendtoend ndp = new NcDashboardendtoend(driver);
	Ncproductstableendtoend np=new Ncproductstableendtoend(driver);
		nu.launchNc();
	Thread.sleep(3000);

	nu.maximizeNc();
	Thread.sleep(3000);
	nlp.enterEmail();
	Thread.sleep(3000);
	nlp.enterpassword();
	Thread.sleep(3000);
	nlp.clickloginbtn();
	Thread.sleep(3000);
	ndp.clickoncatalog();
	Thread.sleep(3000);
	ndp.clickonproducts();
	Thread.sleep(3000);
	np.table();
	Thread.sleep(3000);
	nu.doNclogout();
	Thread.sleep(3000);
	nu.tearDown();
	}
}

	
	
	
	
	
	
	
	
	
	
	
	


