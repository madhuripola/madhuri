package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages1.NcDashboardendtoend;
import ncpages1.NcLoginpage;
import ncpages1.Ncproductinputbox;
import ncpages1.Ncutility;

public class Ncinputboxendtoend {


	public static void main(String[] args)throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 Ncutility nu=new Ncutility(driver);
			NcLoginpage nlp= new NcLoginpage(driver);
			NcDashboardendtoend ndp=new NcDashboardendtoend(driver);
		Ncproductinputbox np=new Ncproductinputbox(driver);
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
		np.enterproduct();
		Thread.sleep(3000);
		np.clicksearch();
		Thread.sleep(3000);
		np.gotosku();
		Thread.sleep(3000);
		np.clickgo();
		Thread.sleep(3000);
		nu.doNclogout();
		Thread.sleep(3000);
		nu.tearDown();
	}
}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	

