package ncpages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ncproductstableendtoend {
	WebDriver driver;

	public Ncproductstableendtoend(WebDriver d) {
		this.driver = d;

	}

	By allrows = By.xpath("//table[@id='products-grid']/tbody/tr");
	By allcolumns = By.xpath("//table[@id='products-grid']/tbody/tr[1]/td");

	public void table() {

		List<WebElement> rows = driver.findElements(allrows);
		int rcount = rows.size();
		System.out.println(rcount);
		List<WebElement> columns = driver.findElements(allcolumns);

		int ccount = columns.size();
		System.out.println(ccount);

		for (int r = 1; r <= rcount; r++) {
		
			
			for (int c = 1; c <= ccount; c++) {
				String table1 = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
System.out.print(table1+"   ");
			}
System.out.println();
		}
	
	}

}
