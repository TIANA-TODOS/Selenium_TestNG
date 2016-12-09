package TestNGTips;

import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test(groups={"performance"})
	public void feature1(){
		System.out.println("inside feature 1");
	}
	

	@Test(groups={"regression"})
	public void feature2(){
		System.out.println("inside feature 2");
	}
	

	@Test(groups={"performance", "regression"})
	public void feature3(){
		System.out.println("inside feature 3");
	}
}
