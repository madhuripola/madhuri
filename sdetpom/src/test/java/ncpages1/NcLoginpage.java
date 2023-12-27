package ncpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule no 1=//create individual class for each webpage
public class NcLoginpage {
	WebDriver driver;

// Rule no 4=create constructor to initialize the value to the webdriver
	public NcLoginpage(WebDriver d) {
		this.driver = d;
	}

// Rule no 2=Provide webelement information in created class
	By Email = By.id("Email");
	By pws = By.name("Password");
	By loginbtn = By.tagName("button");

	// Rule no 3=create individual methods for each webelement based on the type of
	// webelement

	public void enterEmail() {
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys("admin@yourstore.com");
	}

	public void enterpassword() {

		driver.findElement(pws).clear();
		;

		driver.findElement(pws).sendKeys("admin");
	}

	public void clickloginbtn() {
		driver.findElement(loginbtn).click();
	}
}