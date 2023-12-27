package orpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrSystemusers {
	WebDriver driver;
	public OrSystemusers(WebDriver d) {
		this.driver=d;
	
	}

	By EN=By.xpath("(//div[@class='oxd-autocomplete-wrapper'])[1]/descendant::input");
	By search=By.xpath("//button[text()=' Search ' ]");
	
	public void empname() {
		WebElement empname=	driver.findElement(EN);
	}
	
	public void clickonempname() {
		WebElement empname=	driver.findElement(EN);
		
		empname.click();
		
		
	}
	public void goTOFC() {
		WebElement empname=	driver.findElement(EN);
	
		
	
	empname.sendKeys(Keys.TAB,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.ENTER);
	}
	
	
	
public void clickonsearch() {
	driver.findElement(search).click();
}
}