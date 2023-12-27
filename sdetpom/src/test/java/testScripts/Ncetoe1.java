package testScripts;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import ncpages1.NcDashboardendtoend;
import ncpages1.NcLoginpage;
import ncpages1.Ncproducts;
import ncpages1.Ncutility;

public class Ncetoe1 {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Ncutility nu = new Ncutility(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardendtoend ndp = new NcDashboardendtoend(driver);
		Ncproducts np = new Ncproducts(driver);
		nu.launchNc();
		nu.maximizeNc();
		nlp.enterEmail();
		nlp.enterpassword();
		nlp.clickloginbtn();

		boolean output = ndp.verifydashboard();
		if (output == true) {
			System.out.println("Login success");
		} else {

			System.out.println("Login Failed");
		}
        ndp.clickoncatalog();
        Thread.sleep(3000);
		ndp.clickonproducts();
		Thread.sleep(3000);
		np.entercatogorydata1();
		Thread.sleep(3000);
		np.entercatogorydata2();
		Thread.sleep(3000);
		np.entercatogorydata3();
		Thread.sleep(3000);
		np.clickonsearch();
		Thread.sleep(3000);
		np.getalldata();
		
		Thread.sleep(7000);
		nu.doNclogout();
Thread.sleep(3000);
		nu.tearDown();

	}
}
