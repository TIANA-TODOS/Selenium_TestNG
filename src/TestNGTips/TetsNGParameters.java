package TestNGTips;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TetsNGParameters {

	@Parameters("email")
	@Test
	public void login(String email){
		System.out.println("Inside login");
		System.out.println("email");
	}
	
}