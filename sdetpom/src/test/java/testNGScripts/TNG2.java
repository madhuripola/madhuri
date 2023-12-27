package testNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG2 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the precondition for suite level");
	}

	@BeforeTest

	public void beforeTest() {
		System.out.println("This is the precondition for test level");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the precondition for Classlevel");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("This is the precondition for Method level");

	}

	@Test(groups="Smoke")
	public void ex2testMethod1() {
		System.out.println("This is the first Real test Method ");
	}
	@Test(groups="Regression")
	public void testMethod() {
		System.out.println("This is the second Real test Method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the post condition for method level");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is the post condition for class level");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is the post condition for test level");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is the post condition for suite level ");

	}

}