package TestNG;

import org.testng.annotations.Test;

public class SignUpTest {
	@Test
	public void SignUpviaEmail(){ 
		System.out.println("Login via email");
	}

	@Test
	public void SignUpviaFacebook(){ 
		System.out.println("Login via Facebook");
	}

	@Test
	public void SignUpviaInstagram(){ 
		System.out.println("Login via Instagram");
	}

}
