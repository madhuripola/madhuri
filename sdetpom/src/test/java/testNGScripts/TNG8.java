package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG8 {
@Test
	public void method() {
		String str1 = "IT industry";
		String str2 = "Business";
		String str3 = "SDET";
		
		Assert.assertEquals(str1.equals(str2),true,"Please check the values madhuri");
		System.out.println("str3");
	}

}
