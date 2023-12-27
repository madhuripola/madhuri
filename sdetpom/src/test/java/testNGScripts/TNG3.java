package testNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG3{
	
WebDriver driver=new ChromeDriver();
@BeforeClass(alwaysRun=true)
public void ncSetUp()throws Exception{
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(4000);
}
@Test(groups="Regression")
public void ncLogin()throws Exception {
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(8000);
}


@AfterClass(alwaysRun=true)
public void nctearDown()throws Exception {
	driver.quit();
}

}

















	
