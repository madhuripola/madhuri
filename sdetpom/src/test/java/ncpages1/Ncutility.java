package ncpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule no=1,create individual class for each webpage
public class Ncutility {

	WebDriver driver;

	// Rule no=4,create a constructor for each page class
	public Ncutility(WebDriver d) {
		this.driver = d;
	}

	// Rule no=2,provide webelement inforamation in the created class
	By logout = By.xpath("//a[text()='Logout']");

	// Rule no=3,create individual methods for each webelement based on the type of
	// webelement

	public void launchNc() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	public void maximizeNc() {
		driver.manage().window().maximize();

	}

	public void doNclogout() {
		driver.findElement(logout).click();
	}

	public void tearDown() {
		driver.quit();
	}

}
