package ncpages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ncproducts {
	WebDriver driver;

	public Ncproducts(WebDriver d) {
		this.driver = d;
	}

	By catogory = By.xpath("//select[@name='SearchCategoryId']");
	By search = By.xpath("//button[@id='search-products']");

	public void entercatogorydata1() {
		WebElement dd = driver.findElement(catogory);
		Select selection = new Select(dd);
		selection.selectByVisibleText("Computers >> Desktops");
	}

	public void entercatogorydata2() {
		WebElement dd = driver.findElement(catogory);
		Select selection = new Select(dd);
		selection.selectByIndex(0);  
	}

	public void entercatogorydata3() {
		WebElement dd = driver.findElement(catogory);
		Select selection = new Select(dd);
		selection.selectByValue("3");
	}

	public void getalldata() {
		WebElement dd = driver.findElement(catogory);
		Select selection = new Select(dd);
		List<WebElement> alloptions = selection.getOptions();
		int count = alloptions.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String alldata = alloptions.get(i).getText();
			System.out.println(alldata);
		}
	}

	public void clickonsearch() {
		driver.findElement(search).click();
	}

}