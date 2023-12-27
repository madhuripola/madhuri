package testNGScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG10 {

	@DataProvider(name = "Nc_Logindata")
	public Object[][] testdata() {
		Object[][] data = new Object[3][2];
		data[0][0] = "admin@yourstore.com";
		data[0][1] = "admin";
		data[1][0] = "test@yourstore.com";
		data[1][1] = "admin";
		data[2][0] = "admin@yourstore.com";
		data[2][1] = "test";
		return data;

	}

	@Test(dataProvider = "Nc_Logindata")
	public void testmethod(String un, String pws) {
		System.out.println(un);
		System.out.println(pws);
	}

}
