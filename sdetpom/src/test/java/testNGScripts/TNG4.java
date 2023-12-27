package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG4 {

	@Test(groups = "Smoke")
	public void radha() {
		System.out.println("Radha");
		Assert.fail();
	}

	@Test(groups = "Smoke")
	public void krishna() {
		System.out.println("Krishna");
		Assert.fail();
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void rukmini() {
		System.out.println("Rukmini");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void satyabhama() {
		System.out.println("Satyabhama");
	}

}
