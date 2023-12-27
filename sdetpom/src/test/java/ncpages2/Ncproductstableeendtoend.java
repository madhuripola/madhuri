package ncpages2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ncproductstableeendtoend {
	WebDriver driver;
	public Ncproductstableeendtoend(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		}

	 @FindBy(how=How.XPATH,using="//table[@id='products-grid']/tbody/tr")
	 List<WebElement>allrows;

	 
	 @FindBy(how=How.XPATH,using="//table[@id='products-grid']/tbody/tr[1]/td")
	 List<WebElement>allcolumns;
	 
	
	public void calallrowscount() {
		int rcount=allrows.size();
		System.out.println(rcount);
		
		
	}
	public void calallacolumnscount() {
		int ccount=allcolumns.size();
		System.out.println(ccount);
	 
	}
}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 



	
	
	
	
	
	
	
	
	
	

