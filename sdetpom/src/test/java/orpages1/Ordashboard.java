package orpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ordashboard {
	
	
	
	WebDriver driver;
	public Ordashboard(WebDriver d) {
		this.driver=d;
		
		}
	
	By pim=By.xpath("//span[text()='PIM']");
	public void  clickpim() {
		driver.findElement(pim).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
