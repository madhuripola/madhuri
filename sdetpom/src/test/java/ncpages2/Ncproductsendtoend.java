package ncpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ncproductsendtoend {
	WebDriver driver;
	public Ncproductsendtoend(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBys({
		@FindBy(how=How.CLASS_NAME,using="odd"),
		
		@FindBy(xpath="(//input[@name='checkbox_products'])[1]")
	})
	WebElement checkbox;
	
	@FindBy(xpath="//button[@id='delete-selected']")
	
		
		WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement Yes;
	public boolean verifycheckbox(){
		boolean someval=checkbox.isSelected();
		return someval;
	}
		
		public void clickoncheckbox() {
			checkbox.click();
		}
		public void clickondelete() {
			delete.click();
		}
		public void clickonyes() {
			Yes.click();
		}
		
			
	    
			
	
		
	
		
		
		
		
	}
	
	
	
	
	
	
	


