package ncpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ncutilities {
	WebDriver driver;

	public Ncutilities(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Logout")
	WebElement logout;
	public void launchNc() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	public void maximizeNc() {
		driver.manage().window().maximize();

	}

	public void doNclogout() {
		logout.click();
	}

	public void tearDown() {
		driver.quit();
	}

	
	
	
	
	
	

}
