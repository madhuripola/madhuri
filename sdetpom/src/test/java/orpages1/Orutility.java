package orpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Orutility {
	
	WebDriver driver;
	public Orutility(WebDriver d) {
		this.driver=d;
		
		}
	
	By logout=By.xpath("//a[text()='Logout']");
	
	
	public void launchorloginpage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	public void maximizeor() {
		driver.manage().window().maximize();
		
	}
	
	
	
	public void dologout() {
		driver.findElement(logout).click();
		
	}
	
	
	public void teardown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
