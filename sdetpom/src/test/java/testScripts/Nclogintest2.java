package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncpages1.Ncutility;
import ncpages2.NcLoginpage;

public class Nclogintest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		Ncutility nu = new Ncutility(driver);
		NcLoginpage nlp = new NcLoginpage(driver);
		nu.launchNc();
		nu.maximizeNc();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLogin();
		nu.tearDown();

	}

}
