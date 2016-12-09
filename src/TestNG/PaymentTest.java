package TestNG;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void PaymentinDollar(){ 
		System.out.println("Payment in Dollars");
	}

	@Test
	public void PaymentinEuro(){ 
		System.out.println("Payment in Euros");
	}

}
