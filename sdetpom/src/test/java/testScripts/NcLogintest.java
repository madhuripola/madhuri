package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages1.NcDashboardpage;
import ncpages1.NcLoginpage;
import ncpages1.Ncutility;

public class NcLogintest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// object creation for each webpage class
		Ncutility nu = new Ncutility(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardpage ndp = new NcDashboardpage(driver);

		nu.launchNc();
		nu.maximizeNc();
		nlp.enterEmail();
		nlp.enterpassword();
		nlp.clickloginbtn();
		boolean output = ndp.verifyDashboard();
		if (output == true) {
			System.out.println("Login success");
			nu.doNclogout();
		} else {
			System.out.println("Login failed");
		}

		nu.tearDown();

	}

}
