package ncpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule no=1,create individual class for each webpage

public class NcDashboardpage {
	WebDriver driver;

//Rule no=4,create constructor for each page class
	public NcDashboardpage(WebDriver d) {
		this.driver = d;

	}

	// Rule no=2,provide webelement information in the created class

	By dashboard = By.xpath("//h1[contains(text(),'Dashboard')]");

	// Rule no=3,create individual methods for each webelement based on the type of
	// webelement

	public boolean verifyDashboard() {

		boolean val = driver.findElement(dashboard).isDisplayed();
		return val;

	}

}
