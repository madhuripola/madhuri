package ncpages2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ncproducts {
	WebDriver driver;

	public Ncproducts(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath = "//select[@name='SearchCategoryId']")
	WebElement catogory;

	@FindBy(xpath = "//button[@id='search-products']")
	WebElement search;

	public void entercatogorydata1() {

		Select selection = new Select(catogory);
		selection.selectByVisibleText("Computers >> Desktops");

	}

	public void entercatogorydata2() {
	
		Select selection = new Select(catogory);
		selection.selectByIndex(1);

	}

	public void entercatogorydata3() {
		
		Select selection = new Select(catogory);
		selection.selectByValue("3");
	}

	public void getalldata() {
		
		Select selection = new Select(catogory);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String alldata = alloptions.get(i).getText();
			System.out.println(alldata);
		}
	}

	public void clickonsearch() {
		search.click();
	}

}
