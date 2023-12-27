package orpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordashbard {

	WebDriver driver;
	public Ordashbard(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		}
	
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pim;
	public void  clickpim() {
		pim.click();
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

