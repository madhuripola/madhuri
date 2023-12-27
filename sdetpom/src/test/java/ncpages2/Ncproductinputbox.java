package ncpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ncproductinputbox {

	WebDriver driver;

	public Ncproductinputbox(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBys({ @FindBy(how = How.XPATH, using = "//div[@class='col-md-5']"),
			@FindBy(xpath = "//input[@name='SearchProductName']")

	})
	WebElement productname;
	@FindBy(xpath = "//input[@name='GoDirectlyToSku']")
	WebElement godirectlytosku;
	@FindBy(xpath = "//button[@id='search-products']")
	WebElement search;
	@FindBy(xpath = "//button[@id='go-to-product-by-sku']")
	WebElement go;

	public void enterproduct() {

		productname.click();
		productname.sendKeys("laptop");
	}

	public void gotosku() {

		godirectlytosku.click();
		godirectlytosku.sendKeys("COMP_CUST");

	}

	public void clicksearch() {
		search.click();
	}

	public void clickgo() {
		go.click();

	}

}
