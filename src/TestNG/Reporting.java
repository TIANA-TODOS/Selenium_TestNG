package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reporting {

	@Test
	public void login(){
		System.out.println("Login");
	}
	
	@Test
	public void logout(){
		Assert.assertEquals("Test", "Test1");
		System.out.println("Login");
	}
}
