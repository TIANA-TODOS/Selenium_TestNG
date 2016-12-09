package TestNGTips;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnotation_1 {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Initialize Selenium for TestNGAnotation_1");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Opening a browser");
	}
	
	@Test
	public void test1(){
		System.out.println("Inside Test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("Inside Test 2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Closing a browser");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Destroy Selenium for TestNGAnotation_1");
	}
}

