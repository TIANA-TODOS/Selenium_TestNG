package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void LoginviaEmail(){ 
		System.out.println("Login via email");
		//Assert.assertEquals(1, 2);
		//Assert.assertTrue(4>1);
		//Assert.assertFalse(5<9);
		
	}

	@Test
	public void LoginviaFacebook(){ 
		System.out.println("Login via Facebook");
		
		try{
		Assert.assertEquals("Tiana", "Todos");
		}
		catch (Throwable t){
		System.out.println("t");
		}
		
		System.out.println("After Assert Condition");

	}

	@Test
	public void LoginviaInstagram(){ 
		System.out.println("Login via Instagram");
		//throw new SkipException("Instagram functionality is not supported");
	}

}

