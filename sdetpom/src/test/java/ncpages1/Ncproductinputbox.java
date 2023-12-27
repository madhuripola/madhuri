package ncpages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ncproductinputbox {
	WebDriver driver;
	
	public  Ncproductinputbox (WebDriver d) {
		this.driver=d;
		
	}
	By productname=By.xpath("//input[@name='SearchProductName']");
	
	By godirectlytosku=By.xpath("//input[@name='GoDirectlyToSku']");
	
	By search=By.xpath("//button[@id='search-products']");
	By go=By.xpath("//button[@id='go-to-product-by-sku']");
public void enterproduct() {
	WebElement pn=driver.findElement(productname);
	pn.click();
	pn.sendKeys("laptop");
	
}
	
	
	public void gotosku() {
		
		WebElement sku=driver.findElement(godirectlytosku);
		sku.click();
		sku.sendKeys("COMP_CUST");
		
	}
	
	
	public void clicksearch() {
		driver.findElement(search).click();
	}
	public void clickgo() {
		driver.findElement(go).click();
		
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	


