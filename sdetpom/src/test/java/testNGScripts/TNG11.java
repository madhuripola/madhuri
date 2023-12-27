package testNGScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TNG11 {
	@Test
	public void googlemethod() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.quit();

	}
@Test
	public void facebookmethod() throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(6000);
		driver.quit();

	}
@Test
	public void linkedinmethod() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		Thread.sleep(5000);
		driver.quit();

	}

}
