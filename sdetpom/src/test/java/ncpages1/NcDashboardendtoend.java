package ncpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//create individual class for each web page
public class NcDashboardendtoend {
	WebDriver driver;
//create a constructor to initialize value to the web driver
	public NcDashboardendtoend(WebDriver d) {
this.driver = d;
}

	// provide webelement information in created class
	By Dashboard = By.xpath("//h1[contains(text(),'Dashboard')]");

	By catalog = By.xpath("(//p[contains(text(),'Catalog')])[1]");

	By products = By.xpath("(//p[contains(text(),'Products')])[1]");

//create individual methods for each webelement based on type

	public boolean verifydashboard() {
		boolean val = driver.findElement(Dashboard).isDisplayed();
		return val;

	}

	public void clickoncatalog() {
		driver.findElement(catalog).click();
}

	public void clickonproducts() {
		driver.findElement(products).click();
}

}