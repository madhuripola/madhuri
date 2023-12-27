package testNGScripts;

import org.testng.annotations.Test;

public class TNG6 {
@Test(priority=2)
	public void lalitha() {
	System.out.println("Lalitha");
}
	@Test(priority=1)
	
	public void sindhuja() {
		System.out.println("Sindhuja");
	}
	@Test(priority=3)
	public void praveen() {
		System.out.println("Praveen");
		
	}
	@Test(priority=4,enabled=false)
	public void asatyavani() {
		System.out.println("Satyavani");
	}
}
	
	
	
	
	
	
	

