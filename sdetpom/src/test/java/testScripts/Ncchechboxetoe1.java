package testScripts;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import ncpages1.NcDashboardendtoend;
import ncpages1.NcLoginpage;
import ncpages1.Ncproductsendtoend;
import ncpages1.Ncutility;

public class Ncchechboxetoe1 {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    Ncutility nu=new Ncutility(driver);
	NcLoginpage nlp= new NcLoginpage(driver);
	NcDashboardendtoend ndp=new NcDashboardendtoend(driver);
	Ncproductsendtoend np=new Ncproductsendtoend(driver);
	nu.launchNc();
	nu.maximizeNc();
	nlp.enterEmail();
	nlp.enterpassword();
	nlp.clickloginbtn();
	boolean output=ndp.verifydashboard();
	if(output==true) {
		System.out.println("Login success");
		
	}
	
	else{
		System.out.println("Login failed");
		
	}
	ndp.clickoncatalog();
	Thread.sleep(3000);
	ndp.clickonproducts();
	
	boolean output1=np.verifycheckbox();
	
	if(output1==true) {
		System.out.println("checkbox selected");
	}
	else {
		System.out.println("checkbox not selected");
		
	}
	Thread.sleep(3000);
	np.clickoncheckbox();
	Thread.sleep(3000);
	np.clickondelete();
	Thread.sleep(3000);
	np.clickonyes();
	Thread.sleep(3000);
	nu.doNclogout();
	Thread.sleep(3000);
	nu.tearDown();
	
	
	
	
	
	
	
	
	
	
	}
}