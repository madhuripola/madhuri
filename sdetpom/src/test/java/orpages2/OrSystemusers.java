package orpages2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrSystemusers {

	WebDriver driver;
	public OrSystemusers(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	@FindBy(xpath="(//div[@class='oxd-autocomplete-wrapper'])[1]/descendant::input")
	WebElement EN;
	
	@FindBy(xpath="//button[text()=' Search ' ]")
	WebElement search;
	public void cliconempname() {
		
		EN.click();
		}
	public void gotoFP() {
		EN.sendKeys(Keys.TAB,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.ENTER);
	}
	
	

	public void clickonsearch() {
		search.click();
		
	}
	
	
	
	
	
}
