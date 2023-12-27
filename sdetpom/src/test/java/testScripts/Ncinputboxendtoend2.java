package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages2.NcDashboardpageendtoend;
import ncpages2.NcLoginpage;
import ncpages2.Ncproductinputbox;
import ncpages2.Ncutilities;

public class Ncinputboxendtoend2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		Ncutilities nu = new Ncutilities(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardpageendtoend ndp = new NcDashboardpageendtoend(driver);

		Ncproductinputbox np = new Ncproductinputbox(driver);
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
