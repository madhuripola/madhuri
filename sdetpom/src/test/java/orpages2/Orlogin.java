package orpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Orlogin {
	
	WebDriver driver;
	
	public Orlogin(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	@FindBys({
	@FindBy(xpath="(//div[@class='oxd-form-row'])[1]"),
	
	
	@FindBy(xpath="//input[@name='username']")
				})
	WebElement un;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement ps;
	
	@FindBy(tagName="button")
		
	
	WebElement login;
	
	
	public void enterusername() {
		un.sendKeys("Admin");
	}
	
	
	public void enterpws() {
		
				 
    ps.sendKeys("admin123");
	}
	public void clicklogin() {
		
	
		login.click();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	


