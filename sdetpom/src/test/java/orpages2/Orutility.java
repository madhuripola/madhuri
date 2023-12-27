package orpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Orutility {
	WebDriver driver;
	
	public Orutility(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Logout']")
	WebElement logout;
	
	
	
	public void launchorloginpage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	public void maximizeor() {
		driver.manage().window().maximize();
		
	}
	
	
	
	public void dologout() {
		logout.click();
		
	}
	
	
	public void teardown() {
		driver.quit();
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
