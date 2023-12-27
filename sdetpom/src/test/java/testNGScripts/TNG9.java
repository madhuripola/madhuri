package testNGScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG9 {
	@Test
	public void method3() {
		String str1 = "SDET";
		String str2 = "SDET";
		String str3 = "student";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(str1.equals(str3), true);
		System.out.println(str2);
		sa.assertAll();
	}

	@Parameters({ "email", "password", "SDETclass" })
	@Test
	public void method4(String e, String p, String sa) {
		System.out.println(e);

		System.out.println(p);
		System.out.println(sa);

	}
}