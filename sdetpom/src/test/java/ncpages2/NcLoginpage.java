package ncpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Rule no = 1, Create individual class for each web page
public class NcLoginpage {
	
	WebDriver driver;
	//Rule no=4,create a constructor to initialize value to the webdriver
	
	public NcLoginpage(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
	}
	
	
	//Rule no=2,provide webelement information in created class
  @CacheLookup
  @FindBy(how=How.ID,using="Email")
  WebElement email;
  @FindBys({
	  @FindBy(className="inputs"),
	  @FindBy(name="Password")
  })
  WebElement pws;
  @FindAll({
	  @FindBy(xpath="//button[text()='Log i']"),@FindBy(tagName="button")
  })
  
	WebElement loginBtn;  
  //Rule no=3,create individual method for each webelement
 public void enterEmail() {
	 email.clear();
	 email.sendKeys("admin@yourstore.com");
 }
 public void enterPassword() {
	 pws.clear();
	 pws.sendKeys("admin");
 }
 public void clickOnLogin() {
	 loginBtn.click();
 }
}

	 
  
  
  
  
  
  
  
  
	  
	  
	  
	  
 