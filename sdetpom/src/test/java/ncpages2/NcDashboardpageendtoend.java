package ncpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NcDashboardpageendtoend {
	WebDriver driver;

	public NcDashboardpageendtoend(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")
	WebElement Dashboard;

	@FindBys({ @FindBy(xpath = "//nav[@class='mt-2']"),

			@FindBy(xpath = "(//p[contains(text(),'Catalog')])[1]")

	})
	WebElement Catalog;

	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Products')])[1]")
	WebElement Products;

	public boolean verifydashboard() {
		boolean val = Dashboard.isDisplayed();
		return val;

	}

	public void clickoncatalog() {
		Catalog.click();

	}

	public void clickonproducts() {
		Products.click();

	}
}
