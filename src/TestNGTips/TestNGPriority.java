package TestNGTips;
import org.testng.annotations.Test;

public class TestNGPriority {

	@Test
	public void Login(){ 
		System.out.println("Login");
	}

	@Test
	public void Navigate(){ 
		System.out.println("Navigating");
	}
	
	@Test
	public void Logout(){ 
		System.out.println("Logout");
	}
}
