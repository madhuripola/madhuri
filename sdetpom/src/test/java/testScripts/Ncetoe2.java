package testScripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages2.NcDashboardpageendtoend;
import ncpages2.NcLoginpage;
import ncpages2.Ncproducts;
import ncpages2.Ncutilities;

public class Ncetoe2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		Ncutilities nu = new Ncutilities(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardpageendtoend ndp = new NcDashboardpageendtoend(driver);
		Ncproducts np = new Ncproducts(driver);

		nu.launchNc();
		nu.maximizeNc();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLogin();

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
		np.getalldata();
		Thread.sleep(3000);
		np.clickonsearch();
		Thread.sleep(3000);
		nu.doNclogout();
		Thread.sleep(3000);
		nu.tearDown();

	}
}
