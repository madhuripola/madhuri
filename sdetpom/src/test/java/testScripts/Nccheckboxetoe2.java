package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages2.NcDashboardpageendtoend;
import ncpages2.NcLoginpage;

import ncpages2.Ncproductsendtoend;
import ncpages2.Ncutilities;

public class Nccheckboxetoe2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		
		Ncutilities nu = new Ncutilities(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		NcDashboardpageendtoend ndp = new NcDashboardpageendtoend(driver);
		Ncproductsendtoend np = new Ncproductsendtoend(driver);

		nu.launchNc();
		nu.maximizeNc();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLogin();
		nu.maximizeNc();

		boolean output = ndp.verifydashboard();

		if (output == true) {
			System.out.println("Login success");

		}

		else {
			System.out.println("Login got failed");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ndp.clickoncatalog();
		Thread.sleep(3000);
		ndp.clickonproducts();
		Thread.sleep(3000);
		boolean output1 = np.verifycheckbox();
		if (output1 == true) {
			System.out.println("check got selected");
		} else {
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
