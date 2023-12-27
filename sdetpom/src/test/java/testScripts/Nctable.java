package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages2.NcDashboardpageendtoend;
import ncpages2.NcLoginpage;
import ncpages2.Ncproductstableeendtoend;
import ncpages2.Ncutilities;

public class Nctable {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		Ncutilities nu = new Ncutilities(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardpageendtoend ndp = new NcDashboardpageendtoend(driver);
		Ncproductstableeendtoend np = new Ncproductstableeendtoend(driver);

		nu.launchNc();
		Thread.sleep(3000);

		nu.maximizeNc();
		Thread.sleep(3000);
		nlp.enterEmail();
		Thread.sleep(3000);
		nlp.enterPassword();
		Thread.sleep(3000);
		nlp.clickOnLogin();
		Thread.sleep(3000);
		ndp.clickoncatalog();
		Thread.sleep(3000);
		ndp.clickonproducts();
		Thread.sleep(3000);
		np.calallrowscount();
		Thread.sleep(3000);
		np.calallacolumnscount();
		Thread.sleep(3000);
		nu.doNclogout();
		Thread.sleep(3000);
		nu.tearDown();
	}
}
