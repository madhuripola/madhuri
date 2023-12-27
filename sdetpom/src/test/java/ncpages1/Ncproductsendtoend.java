package ncpages1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Ncproductsendtoend {
	WebDriver driver;

	public Ncproductsendtoend(WebDriver d) {
		this.driver = d;
	}

	By checkbox=By.xpath("(//input[@name='checkbox_products'])[1]");
	By delete=By.xpath("//button[@id='delete-selected']");
	By yes=By.xpath("//button[contains(text(),'Yes')]");
	public boolean verifycheckbox() {
		
		boolean val1=driver.findElement(checkbox).isSelected();
		return val1;
	}
	public void clickoncheckbox() {
		driver.findElement(checkbox).click();
		
	}
		
	public void clickondelete() {
		driver.findElement(delete).click();
	}
	public void clickonyes() {
		driver.findElement(yes).click();
	}
}