package testNGScripts;

import org.testng.annotations.Test;

public class TNG1 {
	@Test(groups="Smoke")
	public void ex1testMethod1() {

		System.out.println("Hello darling TestNG");

	}
@Test(groups="Regression")
	public void testMethod2() {
		System.out.println("Bye darling TestNG");
	}

}
