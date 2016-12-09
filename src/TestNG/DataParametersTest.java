package TestNG;

import org.testng.annotations.Test;

public class DataParametersTest {

	@Test(dataProviderClass=DataFileTest.class, dataProvider="data")
	public void signUpUser(String firstName,
							String lastName,
							String email,
							String password){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
	}
	
	@Test(dataProviderClass=DataFileTest.class, dataProvider="data")
	public void loginUser(String email, String password){
		System.out.println(email);
		System.out.println(password);
	}
	
}