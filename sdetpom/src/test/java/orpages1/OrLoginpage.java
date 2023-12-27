package orpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrLoginpage {
	WebDriver driver;
	public OrLoginpage(WebDriver d) {
		this.driver=d;
		
	}
	
	
	By un=By.xpath("//input[@name='username']");
	By ps=By.xpath("//input[@name='password']");
	By login=By.xpath(" //button[text()=' Login ']");
			
	
	public void enterusername() {
		driver.findElement(un).sendKeys("Admin");
	}
	
	
	public void enterpws() {
		
				 
		driver.findElement(ps).sendKeys("admin123");
	}
	public void clicklogin() {
		
	
		driver.findElement(login).click();
	}
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

