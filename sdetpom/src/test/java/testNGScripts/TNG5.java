package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG5 {

	@Test
	public void method1() {
		System.out.println("method1");
		Assert.fail();
	}

	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("method2");
	}

}
